package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public void register() {

        System.out.println("Business Logic");

        repository.save();
    }

}
