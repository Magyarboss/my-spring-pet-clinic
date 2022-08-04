package com.my_pet_clinic.myspringpetclinic.repositories;

import com.my_pet_clinic.myspringpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
