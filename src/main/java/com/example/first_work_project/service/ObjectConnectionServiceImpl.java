package com.example.first_work_project.service;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.classes.ObjectConnection;
import com.example.first_work_project.repository.ApplicationRepository;
import com.example.first_work_project.repository.ObjectConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectConnectionServiceImpl implements ObjectConnectionService{

    @Autowired
    private ObjectConnectionRepository objectConnectionRepository;

    @Override
    public void save(ObjectConnection obj){
        objectConnectionRepository.save(obj);
    }

    @Override
    public List<ObjectConnection> getAll(){
        return objectConnectionRepository.findAll();
    }

    @Override
    public void update(ObjectConnection obj){
        objectConnectionRepository.save(obj);
    }

    @Override
    public void delete(ObjectConnection obj){
        objectConnectionRepository.delete(obj);
    }
}
