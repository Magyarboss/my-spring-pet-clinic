package com.my_pet_clinic.myspringpetclinic.services.map;

import com.my_pet_clinic.myspringpetclinic.model.Vet;
import com.my_pet_clinic.myspringpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
