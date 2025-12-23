package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.VolunteerProfile;

public interface VolunteerProfileRepository
        extends JpaRepository<VolunteerProfile, Long> {
}
