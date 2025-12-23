package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.VolunteerSkill;

public interface VolunteerSkillService {

    VolunteerSkill createSkill(VolunteerSkill skill);

    List<VolunteerSkill> getAllSkills();

    List<VolunteerSkill> getSkillsByVolunteerId(long volunteerId);
}
