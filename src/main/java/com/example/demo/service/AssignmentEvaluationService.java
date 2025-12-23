package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AssignmentEvaluation;

public interface AssignmentEvaluationService {

    AssignmentEvaluation createevaluation(AssignmentEvaluation evaluation);

    List<AssignmentEvaluation> getallevaluations();
}
