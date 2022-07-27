package com.my_pet_clinic.myspringpetclinic.services;

import com.my_pet_clinic.myspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner  owner);
    Set<Owner> findAll();

}
