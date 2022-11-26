package com.example.first_work_project.service;

import com.example.first_work_project.classes.Section;
import com.example.first_work_project.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService{

    @Autowired
    private SectionRepository sectionRepository;


    @Override
    public void save(Section obj) {
        sectionRepository.save(obj);
    }

    @Override
    public List<Section> getAll() {
        return sectionRepository.findAll();
    }

    @Override
    public void update(Section obj) {
        sectionRepository.save(obj);
    }

    @Override
    public void delete(Section obj) {
        sectionRepository.delete(obj);
    }
}
