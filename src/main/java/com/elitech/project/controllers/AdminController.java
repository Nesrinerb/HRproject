package com.elitech.project.controllers;

import com.elitech.project.entities.Admin;
import com.elitech.project.entities.Employee;
import com.elitech.project.services.AdminService;
import com.elitech.project.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/hr_App")
public class AdminController {

    @Autowired
    private AdminService service;


    @GetMapping(value ="/admins")
    public List<Admin> getAdmins(){ return service.getAllAdmins();}

    @GetMapping(value = "/admin/{adminId}")
    public Admin getAdmin(@PathVariable("adminId") int adminId){return service.getAdminById(adminId);}

    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin){return  service.addNewAdmin(admin);}

    @PutMapping(value = "/admin/{adminId}")
    public Admin updateAdmin(@PathVariable("adminId") int adminId, @RequestBody Admin admin){return service.updateAdmin(adminId, admin);}

    @DeleteMapping(value = "/admin/{adminId}")
    public void deleteAdmin(@PathVariable("adminId") int adminId) { service.deleteAdmin(adminId);}

    @GetMapping("/Admin-number")
    public Integer numberOfAdmins(){
        return service.numberOfAdmins();
    }
}
