package com.my_pet_clinic.myspringpetclinic.repositories;

import com.my_pet_clinic.myspringpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
