package com.elitech.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EquipmentReservation {
    @Id
    @GeneratedValue
    private Integer id;

    private Date startDate;

    private Date endDate;

    private String reason;
}
