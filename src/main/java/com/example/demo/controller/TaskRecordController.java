package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TaskRecord;
import com.example.demo.service.TaskRecordService;

@RestController
public class TaskRecordController {

    @Autowired
    private TaskRecordService taskService;

    @PostMapping("/addtask")
    public TaskRecord add(@RequestBody TaskRecord task) {
        return taskService.createtask(task);
    }

    @GetMapping("/showtasks")
    public List<TaskRecord> show() {
        return taskService.getalltasks();
    }
}
