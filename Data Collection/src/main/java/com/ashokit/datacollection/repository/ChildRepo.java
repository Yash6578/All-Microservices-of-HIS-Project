package com.ashokit.datacollection.repository;

import com.ashokit.datacollection.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepo extends JpaRepository<Child, Long> {
}
