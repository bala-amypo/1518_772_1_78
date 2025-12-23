package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String taskName;
    private String requiredSkill;
    private String requiredSkillLevel;
    private String priority;
    private String status;

    public TaskRecord() {
    }

    public TaskRecord(long id, String taskName,
                      String requiredSkill,
                      String requiredSkillLevel,
                      String priority,
                      String status) {
        this.id = id;
        this.taskName = taskName;
        this.requiredSkill = requiredSkill;
        this.requiredSkillLevel = requiredSkillLevel;
        this.priority = priority;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }

    public void setRequiredSkill(String requiredSkill) {
        this.requiredSkill = requiredSkill;
    }

    public String getRequiredSkillLevel() {
        return requiredSkillLevel;
    }

    public void setRequiredSkillLevel(String requiredSkillLevel) {
        this.requiredSkillLevel = requiredSkillLevel;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
