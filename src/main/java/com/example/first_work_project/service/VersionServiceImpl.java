package com.example.first_work_project.service;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.classes.Version;
import com.example.first_work_project.repository.ApplicationRepository;
import com.example.first_work_project.repository.VersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionServiceImpl implements VersionService{

    @Autowired
    private VersionRepository versionRepository;

    @Override
    public void save(Version obj){
        versionRepository.save(obj);
    }

    @Override
    public List<Version> getAll(){
        return versionRepository.findAll();
    }

    @Override
    public void update(Version obj){
        versionRepository.save(obj);
    }

    @Override
    public void delete(Version obj){
        versionRepository.delete(obj);
    }

}
