package com.elitech.project.controllers;

import com.elitech.project.entities.Employee;
import com.elitech.project.repositories.EmployeeRepository;
import com.elitech.project.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hr_App")
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @GetMapping(value ="/employees")
    public List<Employee> getEmployees(){ return service.getAllEmployees();}

    @GetMapping(value = "/employee/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") int employeeId){return service.getEmployeeById(employeeId);}

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){return  service.addNewEmployee(employee);}

    @PutMapping(value = "/employee/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee){return service.updateEmployee(employeeId, employee);}

    @DeleteMapping(value = "/employee/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId) { service.deleteEmployee(employeeId);}

    @GetMapping("/employee-number")
    public Integer numberOfEmployees(){
        return service.numberOfEmployees();
    }
}
