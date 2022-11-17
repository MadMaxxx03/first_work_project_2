package com.example.first_work_project.repository;

import com.example.first_work_project.classes.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface ObjectRepository extends JpaRepository<Object, Integer> {
}
