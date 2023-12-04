package com.elitech.project.services;

import com.elitech.project.entities.Employee;
import com.elitech.project.entities.LeaveRequest;
import com.elitech.project.messages.MessageNotFoundException;
import com.elitech.project.repositories.LeaveRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeaveRequestService {

    private LeaveRequestRepository repository;

    public List<LeaveRequest> getAllLeaveRequests(){return repository.findAll();}

    public LeaveRequest getLeaveRequestById(int id){
        Optional<LeaveRequest> leaveRequestOptional = repository.findById(id);
        if (leaveRequestOptional.isPresent()){
            return leaveRequestOptional.get();
        }else  {
            throw new MessageNotFoundException("Leave Request not found !!! please check the entered data" );
        }
    }

    public LeaveRequest addNewLeaveRequest(LeaveRequest leaveRequest){
        return repository.save(leaveRequest);
    }

    public LeaveRequest updateLeaveRequest(int id, LeaveRequest leaveRequest){
        leaveRequest.setId(id);
        return repository.save(leaveRequest);
    }

    public void deleteLeaveRequest(int id){
        repository.deleteById(id);
    }
}
