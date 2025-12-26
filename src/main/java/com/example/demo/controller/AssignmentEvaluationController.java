package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AssignmentEvaluation;
import com.example.demo.service.AssignmentEvaluationService;

@RestController
public class AssignmentEvaluationController {

    @Autowired
    private AssignmentEvaluationService evaluationService;

    @PostMapping("/addevaluation")
    public AssignmentEvaluation add(@RequestBody AssignmentEvaluation evaluation) {
        return evaluationService.createevaluation(evaluation);
    }

    @GetMapping("/showevaluations")
    public List<AssignmentEvaluation> show() {
        return evaluationService.getallevaluations();
    }
}
