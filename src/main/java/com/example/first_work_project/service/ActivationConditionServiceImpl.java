package com.example.first_work_project.service;

import com.example.first_work_project.classes.ActivationCondition;
import com.example.first_work_project.repository.ActivationConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivationConditionServiceImpl implements ActivationConditionService{

    @Autowired
    private ActivationConditionRepository activationConditionRepository;

    @Override
    public void save(ActivationCondition obj){
        activationConditionRepository.save(obj);
    }

    @Override
    public List<ActivationCondition> getAll(){
        return activationConditionRepository.findAll();
    }

    @Override
    public void update(ActivationCondition obj){
        activationConditionRepository.save(obj);
    }

    @Override
    public void delete(ActivationCondition obj){
        activationConditionRepository.delete(obj);
    }
}
