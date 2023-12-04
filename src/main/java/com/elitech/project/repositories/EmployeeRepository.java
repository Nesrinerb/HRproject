package com.elitech.project.repositories;

import com.elitech.project.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByNumCIN(Integer numCIN);
    Boolean existsByNumCIN(Integer numCIN);
    @Query(value ="SELECT COUNT(*) FROM employee", nativeQuery = true)
    Integer numberOfEmployees();
}
