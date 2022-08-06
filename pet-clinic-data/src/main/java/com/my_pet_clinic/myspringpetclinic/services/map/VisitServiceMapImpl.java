package com.my_pet_clinic.myspringpetclinic.services.map;

import com.my_pet_clinic.myspringpetclinic.model.Visit;
import com.my_pet_clinic.myspringpetclinic.services.VisitService;

import java.util.Set;

public class VisitServiceMapImpl extends AbstractMapService<Visit, Long> implements VisitService {



    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
            || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
