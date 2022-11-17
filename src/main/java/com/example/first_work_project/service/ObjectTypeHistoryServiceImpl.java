package com.example.first_work_project.service;

import com.example.first_work_project.classes.ObjectTypeHistory;
import com.example.first_work_project.repository.ObjectTypeHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjectTypeHistoryServiceImpl implements ObjectTypeHistoryService{

    @Autowired
    private ObjectTypeHistoryRepository objectTypeHistoryRepository;

    @Override
    public void save(ObjectTypeHistory obj){
        objectTypeHistoryRepository.save(obj);
    }

    @Override
    public List<ObjectTypeHistory> getAll(){
        return objectTypeHistoryRepository.findAll();
    }

    @Override
    public void update(ObjectTypeHistory obj){
        objectTypeHistoryRepository.save(obj);
    }

    @Override
    public void delete(ObjectTypeHistory obj){
        objectTypeHistoryRepository.delete(obj);
    }

}
