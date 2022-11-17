package com.example.first_work_project.service;

import com.example.first_work_project.classes.Attribute;
import com.example.first_work_project.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService{

    @Autowired
    private AttributeRepository attributeRepository;

    @Override
    public void save(Attribute obj){
        attributeRepository.save(obj);
    }

    @Override
    public List<Attribute> getAll(){
        return attributeRepository.findAll();
    }

    @Override
    public void update(Attribute obj){
        attributeRepository.save(obj);
    }

    @Override
    public void delete(Attribute obj){
        attributeRepository.delete(obj);
    }

}
