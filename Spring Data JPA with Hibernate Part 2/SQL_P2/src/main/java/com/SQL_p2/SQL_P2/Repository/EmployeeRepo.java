package com.SQL_p2.SQL_P2.Repository;

import com.SQL_p2.SQL_P2.Entites.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {


}
