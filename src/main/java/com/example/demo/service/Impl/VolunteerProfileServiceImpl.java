package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.VolunteerProfile;
import com.example.demo.repository.VolunteerProfileRepository;

@Service
public class VolunteerProfileServiceImpl
        implements VolunteerProfileService {

    @Autowired
    private VolunteerProfileRepository volunteerRepo;

    @Override
    public VolunteerProfile createVolunteer(VolunteerProfile volunteer) {
        return volunteerRepo.save(volunteer);
    }

    @Override
    public List<VolunteerProfile> getAllVolunteers() {
        return volunteerRepo.findAll();
    }

    @Override
    public VolunteerProfile getVolunteerById(long id) {
        return volunteerRepo.findById(id).orElse(null);
    }

    @Override
    public VolunteerProfile updateAvailability(long id, String availabilityStatus) {
        VolunteerProfile vp = volunteerRepo.findById(id).orElse(null);
        if (vp != null) {
            vp.setAvailabilityStatus(availabilityStatus);
            return volunteerRepo.save(vp);
        }
        return null;
    }
}
