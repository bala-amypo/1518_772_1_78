package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskAssignmentRecord;
import com.example.demo.repository.TaskAssignmentRecordRepository;
import com.example.demo.service.TaskAssignmentRecordService;

@Service
public class TaskAssignmentRecordServiceImpl 
        implements TaskAssignmentRecordService {

    @Autowired
    private TaskAssignmentRecordRepository assignmentRepo;

    @Override
    public TaskAssignmentRecord createassignment(TaskAssignmentRecord assignment) {
        return assignmentRepo.save(assignment);
    }

    @Override
    public List<TaskAssignmentRecord> getallassignments() {
        return assignmentRepo.findAll();
    }
}
