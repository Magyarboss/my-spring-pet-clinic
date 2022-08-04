package com.my_pet_clinic.myspringpetclinic.repositories;

import com.my_pet_clinic.myspringpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
