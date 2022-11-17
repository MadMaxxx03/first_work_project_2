package com.example.first_work_project.service;

import com.example.first_work_project.classes.KnowledgeBase;
import com.example.first_work_project.classes.ObjectAttribute;
import com.example.first_work_project.repository.KnowledgeBaseRepository;
import com.example.first_work_project.repository.ObjectAttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectAttributeServiceImpl implements ObjectAttributeService{

    @Autowired
    private ObjectAttributeRepository objectAttributeRepository;

    @Override
    public void save(ObjectAttribute obj){
        objectAttributeRepository.save(obj);
    }

    @Override
    public List<ObjectAttribute> getAll(){
        return objectAttributeRepository.findAll();
    }

    @Override
    public void update(ObjectAttribute obj){
        objectAttributeRepository.save(obj);
    }

    @Override
    public void delete(ObjectAttribute obj){
        objectAttributeRepository.delete(obj);
    }

}
