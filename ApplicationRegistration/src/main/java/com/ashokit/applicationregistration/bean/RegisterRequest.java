package com.ashokit.applicationregistration.bean;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterRequest {
    String fullName;
    String email;
    Long phoneNumber;
    Long ssn;
    Character gender;
    LocalDate dob;
}
