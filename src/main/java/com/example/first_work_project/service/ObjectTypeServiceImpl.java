package com.example.first_work_project.service;

import com.example.first_work_project.classes.ObjectType;
import com.example.first_work_project.repository.ObjectTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectTypeServiceImpl implements ObjectTypeService{

    @Autowired
    private ObjectTypeRepository objectTypeRepository;

    @Override
    public void save(ObjectType obj){
        objectTypeRepository.save(obj);
    }

    @Override
    public List<ObjectType> getAll(){
        return objectTypeRepository.findAll();
    }

    @Override
    public void update(ObjectType obj){
        objectTypeRepository.save(obj);
    }

    @Override
    public void delete(ObjectType obj){
        objectTypeRepository.delete(obj);
    }

}
