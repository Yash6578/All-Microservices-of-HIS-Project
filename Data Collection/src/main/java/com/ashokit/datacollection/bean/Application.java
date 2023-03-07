package com.ashokit.datacollection.bean;

import lombok.Data;

@Data
public class Application {
    Long applicationId;
    String fullName;
    String email;
    Long phoneNumber;
    Long ssn;
    Character gender;
    String stateName;
}
