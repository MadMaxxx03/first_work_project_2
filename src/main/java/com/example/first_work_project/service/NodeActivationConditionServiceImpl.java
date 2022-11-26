package com.example.first_work_project.service;

import com.example.first_work_project.classes.NodeActivationCondition;
import com.example.first_work_project.repository.NodeActivationConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeActivationConditionServiceImpl implements NodeActivationConditionService{

    @Autowired
    private NodeActivationConditionRepository nodeActivationConditionRepository;

    @Override
    public void save(NodeActivationCondition obj) {
        nodeActivationConditionRepository.save(obj);
    }

    @Override
    public List<NodeActivationCondition> getAll() {
        return nodeActivationConditionRepository.findAll();
    }

    @Override
    public void update(NodeActivationCondition obj) {
        nodeActivationConditionRepository.save(obj);
    }

    @Override
    public void delete(NodeActivationCondition obj) {
        nodeActivationConditionRepository.delete(obj);
    }
}
