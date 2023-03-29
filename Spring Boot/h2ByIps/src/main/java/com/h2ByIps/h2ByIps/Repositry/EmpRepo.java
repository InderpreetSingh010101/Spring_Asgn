package com.h2ByIps.h2ByIps.Repositry;

import com.h2ByIps.h2ByIps.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
