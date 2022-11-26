package com.example.first_work_project.service;

import com.example.first_work_project.classes.Node;
import com.example.first_work_project.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeServiceImpl implements NodeService{

    @Autowired
    private NodeRepository nodeRepository;

    @Override
    public void save(Node obj) {
        nodeRepository.save(obj);
    }

    @Override
    public List<Node> getAll() {
        return nodeRepository.findAll();
    }

    @Override
    public void update(Node obj) {
        nodeRepository.save(obj);
    }

    @Override
    public void delete(Node obj) {
        nodeRepository.delete(obj);
    }
}
