package com.my_pet_clinic.myspringpetclinic.repositories;

import com.my_pet_clinic.myspringpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
