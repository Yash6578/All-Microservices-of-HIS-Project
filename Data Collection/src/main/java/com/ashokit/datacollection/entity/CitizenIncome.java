package com.ashokit.datacollection.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CITIZEN_INCOME")
@Data
public class CitizenIncome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INCOME_ID")
    Long incomeId;

    @Column(name = "CASE_NUMBER", unique = true)
    Long caseNumber;

    @Column(name = "EMPLOYEE_MONTHLY_INCOME")
    Integer employeeMonthlyIncome;

    @Column(name = "PROPERTY_INCOME")
    Integer propertyIncome;
}
