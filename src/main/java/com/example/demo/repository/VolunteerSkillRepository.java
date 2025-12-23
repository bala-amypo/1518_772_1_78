package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.VolunteerSkill;

public interface VolunteerSkillRepository
        extends JpaRepository<VolunteerSkill, Long> {

    List<VolunteerSkill> findByVolunteerId(long volunteerId);
}
