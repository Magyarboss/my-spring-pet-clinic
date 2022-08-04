package com.my_pet_clinic.myspringpetclinic.services.springdatajpa;

import com.my_pet_clinic.myspringpetclinic.model.Speciality;
import com.my_pet_clinic.myspringpetclinic.repositories.SpecialityRepository;
import com.my_pet_clinic.myspringpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaServiceImpl implements SpecialityService {

    private final SpecialityRepository specialityRepository;


    public SpecialitySDJpaServiceImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }



    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
