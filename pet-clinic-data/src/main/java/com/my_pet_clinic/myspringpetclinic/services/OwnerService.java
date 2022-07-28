package com.my_pet_clinic.myspringpetclinic.services;

import com.my_pet_clinic.myspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
