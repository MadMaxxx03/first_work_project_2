package com.example.first_work_project.service;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.classes.User;
import com.example.first_work_project.repository.ApplicationRepository;
import com.example.first_work_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User obj){
        userRepository.save(obj);
    }

    @Override
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @Override
    public void update(User obj){
        userRepository.save(obj);
    }

    @Override
    public void delete(User obj){
        userRepository.delete(obj);
    }
}
