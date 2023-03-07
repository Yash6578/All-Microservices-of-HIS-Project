package com.ashokit.datacollection.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CITIZEN_CHILDREN")
@Data
public class CitizenChildren {
    @Id
    @GeneratedValue
    @Column(name = "PARENT_ID")
    Long parentId;

    @Column(name = "CASE_NUMBER")
    Long caseNumber;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "CHILDREN")
    List<Child> childList;
}
