package com.SQL_p2.SQL_P2;

import com.SQL_p2.SQL_P2.Entites.Employee;
import com.SQL_p2.SQL_P2.Entites.Salary;
import com.SQL_p2.SQL_P2.Repository.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SqlP2ApplicationTests {

	@Autowired
	public EmployeeRepo employeeRepo ;

	@Test
	void contextLoads() {
	}
	@Test
	void CreateEmployee() {
		Employee employee = new Employee() ;
		employee.setId(1);
		employee.setFirstName("IPS");
		employee.setLastName("Singh");
		employee.setAge(22);

		Salary sal = new Salary() ;
		sal.setBasic_salary(20000);
		sal.setBonus_salary(2000);
		sal.setSpecial_allowance_salary(1000);
		sal.setTax_amount_salary(1000);

		employee.setSalary(sal);

		employeeRepo.save(employee) ;


	}


}
