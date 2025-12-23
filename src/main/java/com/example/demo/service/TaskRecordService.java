package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.TaskRecord;

public interface TaskRecordService {

    TaskRecord createtask(TaskRecord task);

    List<TaskRecord> getalltasks();
}
