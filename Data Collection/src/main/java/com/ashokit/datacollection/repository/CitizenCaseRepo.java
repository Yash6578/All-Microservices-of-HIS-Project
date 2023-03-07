package com.ashokit.datacollection.repository;

import com.ashokit.datacollection.entity.CitizenCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenCaseRepo extends JpaRepository<CitizenCase, Long> {
}
