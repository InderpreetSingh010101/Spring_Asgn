package Q2.Dao;

import Q2.Entity.Employee;

import java.util.List;

public interface EmployDao {
    List<Employee> findAll();

    Employee findById(int id);

    void DeleteById(int id);

    Employee postEmployee(Employee emp);
}
