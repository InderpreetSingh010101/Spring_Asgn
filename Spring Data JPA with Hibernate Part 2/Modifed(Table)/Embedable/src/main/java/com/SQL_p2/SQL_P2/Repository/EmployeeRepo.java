package com.SQL_p2.SQL_P2.Repository;

import com.SQL_p2.SQL_P2.Entites.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {


}
