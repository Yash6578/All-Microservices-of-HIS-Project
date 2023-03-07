package com.ashokit.applicationregistration.bean;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CitizenApplicationDto {
    Long applicationId;
    String fullName;
    String email;
    Long phoneNumber;
    Long ssn;
    Character gender;
    String stateName;
    LocalDate dob;
}
