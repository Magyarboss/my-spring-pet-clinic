package com.my_pet_clinic.myspringpetclinic.services.map;


import com.my_pet_clinic.myspringpetclinic.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit5 test.
 *
 * @author <a href="mailto:k.czechowski83@gmail.com">Krzysztof Czechowski</a>
 */

class PetServiceMapImplTest {

    private PetServiceMapImpl petServiceMapImpl;

    private final Long petId = 1L;

    @BeforeEach
    void setUp() {

        petServiceMapImpl = new PetServiceMapImpl();

        petServiceMapImpl.save(Pet.builder().id(petId).build());
    }

    @Test
    void findAll() {

        Set<Pet> petSet = petServiceMapImpl.findAll();

        assertEquals(1, petSet.size());
    }

    @Test
    void findByIdExistingId() {

        Pet pet = petServiceMapImpl.findById(petId);

        assertEquals(petId, pet.getId());
    }

    @Test
    void findByIdNotExistingId() {

        Pet pet = petServiceMapImpl.findById(5L);

        assertNull(pet);
    }

    @Test
    void findByIdNullId() {

        Pet pet = petServiceMapImpl.findById(null);

        assertNull(pet);
    }

    @Test
    void saveExistingId() {

        Long id = 2L;

        Pet pet2 = Pet.builder().id(id).build();

        Pet savedPet = petServiceMapImpl.save(pet2);

        assertEquals(id, savedPet.getId());
    }

    @Test
    void saveDuplicateId() {

        Long id = 1L;

        Pet pet2 = Pet.builder().id(id).build();

        Pet savedPet = petServiceMapImpl.save(pet2);

        assertEquals(id, savedPet.getId());
        assertEquals(1, petServiceMapImpl.findAll().size());
    }

    @Test
    void saveNoId() {

        Pet savedPet = petServiceMapImpl.save(Pet.builder().build());

        assertNotNull(savedPet);
        assertNotNull(savedPet.getId());
        assertEquals(2, petServiceMapImpl.findAll().size());
    }

    @Test
    void deletePet() {

        petServiceMapImpl.delete(petServiceMapImpl.findById(petId));

        assertEquals(0, petServiceMapImpl.findAll().size());

    }

    @Test
    void deleteWithWrongId() {

        Pet pet = Pet.builder().id(5L).build();

        petServiceMapImpl.delete(pet);

        assertEquals(1, petServiceMapImpl.findAll().size());
    }

    @Test
    void deleteWithNullId() {

        Pet pet = Pet.builder().build();

        petServiceMapImpl.delete(pet);

        assertEquals(1, petServiceMapImpl.findAll().size());
    }

    @Test
    void deleteNull() {

        petServiceMapImpl.delete(null);

        assertEquals(1, petServiceMapImpl.findAll().size());

    }

    @Test
    void deleteByIdCorrectId() {

        petServiceMapImpl.deleteById(petId);

        assertEquals(0, petServiceMapImpl.findAll().size());
    }

    @Test
    void deleteByIdWrongId() {

        petServiceMapImpl.deleteById(5L);

        assertEquals(1, petServiceMapImpl.findAll().size());
    }

    @Test
    void deleteByIdNullId() {

        petServiceMapImpl.deleteById(null);

        assertEquals(1, petServiceMapImpl.findAll().size());
    }
}