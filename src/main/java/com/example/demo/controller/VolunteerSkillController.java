package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.VolunteerSkill;
import com.example.demo.service.VolunteerSkillService;

@RestController
public class VolunteerSkillController {

    @Autowired
    private VolunteerSkillService skillService;

    @PostMapping("/addskill")
    public VolunteerSkill add(@RequestBody VolunteerSkill vs) {
        return skillService.createskill(vs);
    }

    @GetMapping("/showskills")
    public List<VolunteerSkill> show() {
        return skillService.getallskills();
    }

    @GetMapping("/skills/{volunteerId}")
    public List<VolunteerSkill> getByVolunteer(@PathVariable long volunteerId) {
        return skillService.getskillsbyvolunteer(volunteerId);
    }
}
