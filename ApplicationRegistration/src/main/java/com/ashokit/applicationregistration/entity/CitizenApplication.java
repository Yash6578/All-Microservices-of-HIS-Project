package com.ashokit.applicationregistration.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class CitizenApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "APPLICATION_ID")
    Long applicationId;

    @Column(name = "FULL_NAME")
    String fullName;

    @Column(name = "Email")
    String email;

    @Column(name = "PHONE_NUMBER")
    Long phoneNumber;

    @Column(name = "SSN")
    Long ssn;

    @Column(name = "GENDER")
    Character gender;

    @Column(name = "STATE_NAME")
    String stateName;

    @Column(name = "DOB")
    LocalDate dob;

    @CreationTimestamp
    @Column(name = "CREATE_DATE", updatable = false)
    LocalDate createdDate;

    @UpdateTimestamp
    @Column(name = "UPDATE_DATE", insertable = false)
    LocalDate updateDate;

    @Column(name = "CREATE_BY")
    String createdBy;

    @Column(name = "Update_BY")
    String updateBy;
}
