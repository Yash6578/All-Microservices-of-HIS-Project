package com.ashokit.applicationregistration.repository;

import com.ashokit.applicationregistration.entity.CitizenApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenApplicationRepo extends JpaRepository<CitizenApplication, Long> {
}
