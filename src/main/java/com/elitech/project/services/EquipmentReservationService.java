package com.elitech.project.services;

import com.elitech.project.entities.EquipmentReservation;
import com.elitech.project.messages.MessageNotFoundException;
import com.elitech.project.repositories.EquipmentReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentReservationService  {
    private EquipmentReservationRepository repository;

    public List<EquipmentReservation> getAllReservations(){return repository.findAll();}

    public EquipmentReservation getReservationById(int id){
        Optional<EquipmentReservation> reservationOptional = repository.findById(id);
        if (reservationOptional.isPresent()){
            return reservationOptional.get();
        }else  {
            throw new MessageNotFoundException("Equipment Reservation  not found !!! please check the entered data" );
        }
    }

    public EquipmentReservation addNewReservation(EquipmentReservation reservation){
        return repository.save(reservation);
    }

    public EquipmentReservation updateReservation(int id, EquipmentReservation reservation){
        reservation.setId(id);
        return repository.save(reservation);
    }

    public void deleteReservation(int id){
        repository.deleteById(id);
    }
}
