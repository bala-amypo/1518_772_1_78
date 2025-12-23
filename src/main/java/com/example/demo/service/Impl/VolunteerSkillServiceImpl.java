package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.VolunteerSkill;
import com.example.demo.repository.VolunteerSkillRepository;

@Service
public class VolunteerSkillServiceImpl implements VolunteerSkillService {

    @Autowired
    private VolunteerSkillRepository skillRepo;

    @Override
    public VolunteerSkill createskill(VolunteerSkill skill) {
        return skillRepo.save(skill);
    }

    @Override
    public List<VolunteerSkill> getallskills() {
        return skillRepo.findAll();
    }

    @Override
    public List<VolunteerSkill> getskillsbyvolunteer(long volunteerId) {
        return skillRepo.findByVolunteerId(volunteerId);
    }
}
