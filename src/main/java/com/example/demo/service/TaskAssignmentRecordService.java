package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.TaskAssignmentRecord;

public interface TaskAssignmentRecordService {

    TaskAssignmentRecord createassignment(TaskAssignmentRecord assignment);

    List<TaskAssignmentRecord> getallassignments();
}
