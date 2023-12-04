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
public class Admin {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer CINNumber;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String department;

    private String speciality;

    private String grade;

    private String category;

    private Integer age;
}
