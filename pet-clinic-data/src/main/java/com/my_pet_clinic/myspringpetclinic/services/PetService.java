package com.my_pet_clinic.myspringpetclinic.services;

import com.my_pet_clinic.myspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet  pet);
    Set<Pet> findAll();

}

