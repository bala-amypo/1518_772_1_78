package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TaskAssignmentRecord;

public interface TaskAssignmentRecordRepository 
        extends JpaRepository<TaskAssignmentRecord, Long> {

}
