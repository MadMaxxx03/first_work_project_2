package com.example.first_work_project.repository;

import com.example.first_work_project.classes.ObjectAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectAttributeRepository extends JpaRepository<ObjectAttribute, Integer> {
}
