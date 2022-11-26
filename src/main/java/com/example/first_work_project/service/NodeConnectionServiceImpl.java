package com.example.first_work_project.service;

import com.example.first_work_project.classes.NodeConnection;
import com.example.first_work_project.repository.NodeConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeConnectionServiceImpl implements NodeConnectionService{

    @Autowired
    private NodeConnectionRepository nodeConnectionRepository;

    @Override
    public void save(NodeConnection obj) {
        nodeConnectionRepository.save(obj);
    }

    @Override
    public List<NodeConnection> getAll() {
        return nodeConnectionRepository.findAll();
    }

    @Override
    public void update(NodeConnection obj) {
        nodeConnectionRepository.save(obj);
    }

    @Override
    public void delete(NodeConnection obj) {
        nodeConnectionRepository.delete(obj);
    }
}
