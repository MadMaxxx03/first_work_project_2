package com.example.first_work_project.service;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.classes.ObjectSection;
import com.example.first_work_project.repository.ApplicationRepository;
import com.example.first_work_project.repository.ObjectSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectSectionServiceImpl implements ObjectSectionService{

    @Autowired
    private ObjectSectionRepository objectSectionRepository;

    @Override
    public void save(ObjectSection obj){
        objectSectionRepository.save(obj);
    }

    @Override
    public List<ObjectSection> getAll(){
        return objectSectionRepository.findAll();
    }

    @Override
    public void update(ObjectSection obj){
        objectSectionRepository.save(obj);
    }

    @Override
    public void delete(ObjectSection obj){
        objectSectionRepository.delete(obj);
    }

}
