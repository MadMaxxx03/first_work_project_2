package com.example.first_work_project.service;

import java.util.List;

public interface GeneralService<T> {

    void save(T obj);

    List<T> getAll();

    void update(T obj);

    void delete(T obj);

}
