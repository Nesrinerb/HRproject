package com.elitech.project.repositories;

import com.elitech.project.entities.EquipmentReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentReservationRepository extends JpaRepository<EquipmentReservation, Integer> {
}
