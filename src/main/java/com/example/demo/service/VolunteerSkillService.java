package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.VolunteerSkill;

public interface VolunteerSkillService {

    VolunteerSkill createskill(VolunteerSkill skill);

    List<VolunteerSkill> getallskills();

    List<VolunteerSkill> getskillsbyvolunteer(long volunteerId);
}
