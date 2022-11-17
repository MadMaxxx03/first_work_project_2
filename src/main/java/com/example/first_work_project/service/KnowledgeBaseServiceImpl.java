package com.example.first_work_project.service;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.classes.KnowledgeBase;
import com.example.first_work_project.repository.ApplicationRepository;
import com.example.first_work_project.repository.KnowledgeBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeBaseServiceImpl implements KnowledgeBaseService{

    @Autowired
    private KnowledgeBaseRepository knowledgeBaseRepository;

    @Override
    public void save(KnowledgeBase obj){
        knowledgeBaseRepository.save(obj);
    }

    @Override
    public List<KnowledgeBase> getAll(){
        return knowledgeBaseRepository.findAll();
    }

    @Override
    public void update(KnowledgeBase obj){
        knowledgeBaseRepository.save(obj);
    }

    @Override
    public void delete(KnowledgeBase obj){
        knowledgeBaseRepository.delete(obj);
    }

}
