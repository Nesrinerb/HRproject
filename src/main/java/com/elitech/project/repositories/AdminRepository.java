package com.elitech.project.repositories;

import com.elitech.project.entities.Admin;
import com.elitech.project.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {



    Boolean existsByNumCIN(Integer numCIN);
    @Query(value ="SELECT COUNT(*) FROM admin ", nativeQuery = true)
    Integer numberOfAdmins();
}
