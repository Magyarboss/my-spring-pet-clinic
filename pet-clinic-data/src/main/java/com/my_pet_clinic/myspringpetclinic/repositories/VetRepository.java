package com.my_pet_clinic.myspringpetclinic.repositories;

import com.my_pet_clinic.myspringpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
