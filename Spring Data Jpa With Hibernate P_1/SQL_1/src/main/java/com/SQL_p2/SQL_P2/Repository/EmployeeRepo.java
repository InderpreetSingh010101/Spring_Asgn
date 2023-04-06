package com.SQL_p2.SQL_P2.Repository;


import com.SQL_p2.SQL_P2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>  , PagingAndSortingRepository<Employee,Integer> {

    List<Employee>findByAge(int age);
    List<Employee>findBylocation(String location) ;

    // >>

    List<Employee>findByName(String name) ;

    List<Employee>findByNameLike(String name) ;
    List<Employee>findByAgeBetween(int starting , int ending) ;

    // >>

    // >> >> Paging AND Sorting Hands On Methods << <<


}
