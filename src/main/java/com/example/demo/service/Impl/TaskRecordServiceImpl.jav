package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaskRecord;
import com.example.demo.repository.TaskRecordRepository;

@Service
public class TaskRecordServiceImpl implements TaskRecordService {

    @Autowired
    private TaskRecordRepository taskRepo;

    @Override
    public TaskRecord createtask(TaskRecord task) {
        return taskRepo.save(task);
    }

    @Override
    public List<TaskRecord> getalltasks() {
        return taskRepo.findAll();
    }
}
