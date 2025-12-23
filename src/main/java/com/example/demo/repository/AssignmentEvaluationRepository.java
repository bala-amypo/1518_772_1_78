package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AssignmentEvaluation;

public interface AssignmentEvaluationRepository
        extends JpaRepository<AssignmentEvaluation, Long> {

}
