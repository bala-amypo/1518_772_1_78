package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TaskAssignmentRecord;
import com.example.demo.service.TaskAssignmentRecordService;

@RestController
public class TaskAssignmentRecordController {

    @Autowired
    private TaskAssignmentRecordService assignmentService;

    @PostMapping("/addassignment")
    public TaskAssignmentRecord add(@RequestBody TaskAssignmentRecord assignment) {
        return assignmentService.createassignment(assignment);
    }

    @GetMapping("/showassignments")
    public List<TaskAssignmentRecord> show() {
        return assignmentService.getallassignments();
    }
}
