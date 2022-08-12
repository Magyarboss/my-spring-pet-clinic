package com.my_pet_clinic.myspringpetclinic.services;

import com.my_pet_clinic.myspringpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);  // Spring data jpa nacin imenovanja findAll (nađe sve)
                                                        // ByLastName (je property) i Like (kada prosljedimo string da bude like that string)
}
