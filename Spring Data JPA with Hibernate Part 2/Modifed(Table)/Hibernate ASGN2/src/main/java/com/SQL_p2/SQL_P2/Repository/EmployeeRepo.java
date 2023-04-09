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

    //1.Display the first name, last name of all employees having salary greater than average salary
    // ordered in ascending by their age and in descending by their salary.


    @Query("select firstName , lastName from Employee where salary >(select avg(salary) from Employee ) ORDER BY age ASC , salary DESC")
     List<Object[]>displaySalwithOrdering() ;

    //Q2 >>Update salary of all employees by a salary passed as a parameter whose existing
    // salary is less than the average salary.
    @Modifying()
    @Query("update Employee set salary = salary + :newsal where salary < :avgsal ")

    void updateSalForLessAvg(@Param("newsal") int newsal , @Param("avgsal") int avgsal) ;
 // Q3>> Delete all employees with minimum salary.

    @Query("delete from Employee where salary < :minsal")
    @Modifying
    void deleteWithMinSal(@Param("minsal") int minSal) ;

    // >>      >>    Native Query  <<    <<



    // Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value = "select emp_id , emp_firstName , emp_age  from employee where emp_lastname like '%al' " , nativeQuery = true)
    List<Object[]> findByLastNameNQ();

    //    Delete all employees with age greater than 45(Should be passed as a parameter)

    @Query(value = "delete from employee where emp_age > 45" , nativeQuery = true)
    @Modifying
    void deleteEmpOnAge();
}
