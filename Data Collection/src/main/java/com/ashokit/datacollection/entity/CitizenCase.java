package com.ashokit.datacollection.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CITIZEN_CASES")
@Data
public class CitizenCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CASE_ID")
    Long caseId;

    @Column(name = "CASE_NUMBER", unique = true)
    Long caseNumber;

    @Column(name = "APPLICATION_ID")
    Long applicationId;

    @Column(name = "PLAN_ID")
    Long planId;
}
