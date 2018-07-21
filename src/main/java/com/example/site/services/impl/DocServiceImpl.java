package com.example.site.services.impl;

import com.example.site.model.Doctor;
import com.example.site.repositories.DoctorRepository;
import com.example.site.services.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocServiceImpl implements DocService{

    private final DoctorRepository repository;

    @Autowired
    public DocServiceImpl(DoctorRepository repository) {
        this.repository = repository;
    }

    public List<Doctor> getDoctors(int page, int size){
        return repository.findAll(PageRequest.of(page, size)).getContent();
    }

    public List<Doctor> getDoctorsBySpecialty(String specialty){
        return repository.findBySpecialty(specialty);
    }

}
