package com.example.first_work_project.repository;

import com.example.first_work_project.classes.NodeActivationCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeActivationConditionRepository extends JpaRepository<NodeActivationCondition, Integer> {
}
