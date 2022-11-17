package com.example.first_work_project.service;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public void save(Application obj){
        applicationRepository.save(obj);
    }

    @Override
    public List<Application> getAll(){
        return applicationRepository.findAll();
    }

    @Override
    public void update(Application obj){
        applicationRepository.save(obj);
    }

    @Override
    public void delete(Application obj){
        applicationRepository.delete(obj);
    }

}
