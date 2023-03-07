package com.ashokit.eligibilitydetermination.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ELIGIBILITY_ID")
    Long eligibilityId;

    @Column(name = "CASE_NUMBER")
    Long caseNo;

    @Column(name = "PLAN_NAME")
    String planName;

    @Column(name = "PLAN_STATUS")
    Character planStatus;

    @Column(name = "PLAN_START_DATE")
    LocalDate planStartDate;

    @Column(name = "PLAN_END_DATE")
    LocalDate planEndDate;

    @Column(name = "BENEFIT_AMOUNT")
    Double benefitAmount;

    @Column(name = "DENIAL_REASON")
    String denialReason;

    @Column(name = "CREATED_BY")
    String createdBy;

    @Column(name = "UPDATED_BY")
    String updatedBy;

    @CreationTimestamp
    @Column(name = "CREATED_DATE", updatable = false)
    LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "UPDATED_DATE", insertable = false)
    LocalDateTime updatedDate;

}
