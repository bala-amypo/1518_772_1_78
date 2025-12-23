package com.example.demo.controller;

import com.example.demo.model.VolunteerProfile;
import com.example.demo.service.VolunteerProfileService;

import io.swagger.v3.oas.annotations.Tag;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
@Tag(name = "Volunteer Profiles")
public class VolunteerProfileController {

    private final VolunteerProfileService service;

    public VolunteerProfileController(VolunteerProfileService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "Create volunteer")
    public VolunteerProfile createVolunteer(
            @RequestBody VolunteerProfile profile) {
        return service.createVolunteer(profile);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get volunteer by ID")
    public VolunteerProfile getVolunteer(@PathVariable Long id) {
        return service.getVolunteerById(id);
    }

    @GetMapping
    @Operation(summary = "List all volunteers")
    public List<VolunteerProfile> getAll() {
        return service.getAllVolunteers();
    }

    @PutMapping("/{id}/availability")
    @Operation(summary = "Update availability status")
    public VolunteerProfile updateAvailability(
            @PathVariable Long id,
            @RequestParam String availabilityStatus) {
        return service.updateAvailability(id, availabilityStatus);
    }

    @GetMapping("/lookup/{volunteerId}")
    @Operation(summary = "Lookup volunteer by volunteerId")
    public VolunteerProfile lookup(@PathVariable String volunteerId) {
        return service.findByVolunteerId(volunteerId);
    }
}
