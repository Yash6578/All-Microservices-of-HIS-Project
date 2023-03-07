package com.ashokit.eligibilitydetermination.repository;

import com.ashokit.eligibilitydetermination.entity.EligibilityDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EligibilityDetailsRepo extends JpaRepository<EligibilityDetails, Long> {
}
