package com.elitech.project.services;

import com.elitech.project.entities.Employee;
import com.elitech.project.entities.Equipment;
import com.elitech.project.messages.MessageNotFoundException;
import com.elitech.project.repositories.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService {

    private EquipmentRepository repository;

    public List<Equipment> getAllEquipments(){return repository.findAll();}

    public Equipment getEquipmentById(int id){
        Optional<Equipment> equipmentOptional = repository.findById(id);
        if (equipmentOptional.isPresent()){
            return equipmentOptional.get();
        }else  {
            throw new MessageNotFoundException("Equipment not found !!! please check the entered data" );
        }
    }

    public Equipment addNewEquipment(Equipment equipment){
        return repository.save(equipment);
    }

    public Equipment updateEquipment(int id, Equipment equipment){
        equipment.setId(id);
        return repository.save(equipment);
    }

    public void deleteEquipment(int id){
        repository.deleteById(id);
    }
}
