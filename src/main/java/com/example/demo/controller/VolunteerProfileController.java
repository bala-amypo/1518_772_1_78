package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.VolunteerProfile;
import com.example.demo.service.VolunteerProfileService;

@RestController
public class VolunteerProfileController {

    @Autowired
    private VolunteerProfileService volunteerProfileService;

    @PostMapping("/addvolunteer")
    public VolunteerProfile add(@RequestBody VolunteerProfile vp) {
        return volunteerProfileService.createVolunteer(vp);
    }

    @GetMapping("/showvolunteers")
    public List<VolunteerProfile> show() {
        return volunteerProfileService.getAllVolunteers();
    }

    @GetMapping("/volunteer/{id}")
    public VolunteerProfile getById(@PathVariable long id) {
        return volunteerProfileService.getVolunteerById(id);
    }

    @PutMapping("/volunteer/{id}/availability")
    public VolunteerProfile updateAvailability(
            @PathVariable long id,
            @RequestParam String availabilityStatus) {
        return volunteerProfileService.updateAvailability(id, availabilityStatus);
    }
}
