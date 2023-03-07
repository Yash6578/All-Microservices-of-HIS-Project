package com.ashokit.datacollection.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "CHILDREN")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHILDREN_ID")
    Long id;

    @Column(name = "CHILDREN_NAME")
    String name;

    @Column(name = "CHILDREN_SSN")
    Long ssn;

    @Column(name = "CHILDREN_DOB")
    LocalDate dob;
}
