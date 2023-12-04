package com.elitech.project.services;

import com.elitech.project.entities.Employee;
import com.elitech.project.messages.MessageNotFoundException;
import com.elitech.project.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    public List<Employee> getAllEmployees(){return repository.findAll();}

    public Employee getEmployeeById(int id){
        Optional<Employee> employeeOptional = repository.findById(id);
        if (employeeOptional.isPresent()){
            return employeeOptional.get();
        }else  {
         throw new MessageNotFoundException("Employee not found !!! please check the entered data" );
        }
    }

    public Employee addNewEmployee(Employee employee){
        var exist = repository.existsByNumCIN(employee.getNumCIN());
        if (exist){
            return repository.save(employee);
        }
        else {
            throw new MessageNotFoundException("Employee already Exist!!!" );        }
    }

    public Employee updateEmployee(int id, Employee employee){
        employee.setId(id);
        return repository.save(employee);
    }

    public void deleteEmployee(int id){
        repository.deleteById(id);
    }

    public Integer numberOfEmployees(){
        return repository.numberOfEmployees();
    }

}
