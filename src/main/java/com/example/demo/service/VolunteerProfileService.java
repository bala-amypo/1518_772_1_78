package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.VolunteerProfile;

public interface VolunteerProfileService {

    VolunteerProfile createVolunteer(VolunteerProfile volunteer);

    List<VolunteerProfile> getAllVolunteers();

    VolunteerProfile getVolunteerById(long id);

    VolunteerProfile updateAvailability(long id, String availabilityStatus);
}
