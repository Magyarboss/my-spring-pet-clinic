package com.my_pet_clinic.myspringpetclinic.services.map;

import com.my_pet_clinic.myspringpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class OwnerServiceMapImplTest {

    OwnerServiceMapImpl ownerServiceMapImpl;

    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp() {
        ownerServiceMapImpl = new OwnerServiceMapImpl(new PetTypeServiceMapImpl(), new PetServiceMapImpl());

        ownerServiceMapImpl.save(Owner.builder().id(ownerId).lastName(lastName).build());

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet =  ownerServiceMapImpl.findAll();

        assertEquals(1, ownerSet.size());

    }

    @Test
    void findById() {
        Owner owner = ownerServiceMapImpl.findById(ownerId);

        assertEquals(ownerId, owner.getId());

    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();

        Owner  savedOwner = ownerServiceMapImpl.save(owner2);

        assertEquals(id, savedOwner.getId());

    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerServiceMapImpl.save(Owner.builder().build());

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());

    }

    @Test
    void delete() {

        ownerServiceMapImpl.delete(ownerServiceMapImpl.findById(ownerId));

        assertEquals(0, ownerServiceMapImpl.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMapImpl.deleteById(ownerId);

        assertEquals(0, ownerServiceMapImpl.findAll().size());

    }

    @Test
    void findByLastName() {
        Owner smith = ownerServiceMapImpl.findByLastName(lastName);

        assertNotNull(smith);

        assertEquals(ownerId, smith.getId());

    }
}