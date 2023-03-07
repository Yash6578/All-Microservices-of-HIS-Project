package com.ashokit.datacollection.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CITIZEN_EDUCATION")
@Data
public class CitizenEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EDUCATION_ID")
    Long educationID;

    @Column(name = "CASE_NUMBER", unique = true)
    Long caseNumber;

    @Column(name = "Highest_DEGREE")
    String highestDegree;

    @Column(name = "HIGHEST_DEGREE_PASSING_YEAR")
    Integer highestDegreePassingYear;

    @Column(name = "UNIVERSITY_NAME")
    String universityName;
}
