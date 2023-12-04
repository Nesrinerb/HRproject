package com.elitech.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer numCIN;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private String category;

    private String grade;

    private Integer leaveBalance;

    private Integer salary;

    private String mission;
}
