package com.elitech.project.services;
import com.elitech.project.entities.Admin;
import com.elitech.project.messages.MessageNotFoundException;
import com.elitech.project.repositories.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private AdminRepository repository;

    public List<Admin> getAllAdmins(){
        return repository.findAll();
    }

    public Admin getAdminById(int id){
        Optional<Admin> adminOptional = repository.findById(id);
        if (adminOptional.isPresent()){
            return adminOptional.get();
        }else {
            throw new MessageNotFoundException("Admin not found !!! Please check you entered data");
        }
    }

    public Admin addNewAdmin(Admin admin){
        return repository.save(admin);
    }

    public Admin updateAdmin(int id, Admin admin){
        admin.setId(id);
        return repository.save(admin);
    }

    public void deleteAdmin(int id){
        repository.deleteById(id);
    }

    public Integer numberOfAdmins(){
        return repository.numberOfAdmins();
    }

}
