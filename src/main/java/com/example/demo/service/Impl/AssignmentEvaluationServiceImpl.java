package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AssignmentEvaluation;
import com.example.demo.repository.AssignmentEvaluationRepository;
import com.example.demo.service.AssignmentEvaluationService;

@Service
public class AssignmentEvaluationServiceImpl
        implements AssignmentEvaluationService {

    @Autowired
    private AssignmentEvaluationRepository evaluationRepo;

    @Override
    public AssignmentEvaluation createevaluation(AssignmentEvaluation evaluation) {
        return evaluationRepo.save(evaluation);
    }

    @Override
    public List<AssignmentEvaluation> getallevaluations() {
        return evaluationRepo.findAll();
    }
}
