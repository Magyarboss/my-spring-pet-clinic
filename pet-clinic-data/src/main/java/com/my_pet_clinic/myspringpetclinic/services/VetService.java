package com.my_pet_clinic.myspringpetclinic.services;

import com.my_pet_clinic.myspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet  vet);
    Set<Vet> findAll();

}
