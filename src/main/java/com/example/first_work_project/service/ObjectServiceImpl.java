package com.example.first_work_project.service;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.classes.Object;
import com.example.first_work_project.repository.ApplicationRepository;
import com.example.first_work_project.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectServiceImpl implements ObjectService{

    @Autowired
    private ObjectRepository objectRepository;

    @Override
    public void save(Object obj){
        objectRepository.save(obj);
    }

    @Override
    public List<Object> getAll(){
        return objectRepository.findAll();
    }

    @Override
    public void update(Object obj){
        objectRepository.save(obj);
    }

    @Override
    public void delete(Object obj){
        objectRepository.delete(obj);
    }

}
