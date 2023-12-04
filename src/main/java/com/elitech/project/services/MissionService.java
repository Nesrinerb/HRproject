package com.elitech.project.services;

import com.elitech.project.entities.Mission;
import com.elitech.project.messages.MessageNotFoundException;
import com.elitech.project.repositories.MissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {

    private MissionRepository repository;

    public List<Mission> getAllMissions(){
        return repository.findAll();
    }

    public Mission getMissionById(int id){
        Optional<Mission> missionOptional = repository.findById(id);
        if (missionOptional.isPresent()){
            return missionOptional.get();
        }else {
            throw new MessageNotFoundException("Mission not found !!! Please check you entered data");
        }
    }

    public Mission addNewMission(Mission mission){
        return repository.save(mission);
    }

    public Mission updateMission(int id, Mission mission){
        mission.setId(id);
        return repository.save(mission);
    }

    public void deleteMission(int id){
        repository.deleteById(id);
    }
}
