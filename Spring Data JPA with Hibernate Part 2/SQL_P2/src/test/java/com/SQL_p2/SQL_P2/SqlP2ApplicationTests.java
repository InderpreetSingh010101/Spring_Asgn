package com.SQL_p2.SQL_P2;

import com.SQL_p2.SQL_P2.Entites.Employee;
import com.SQL_p2.SQL_P2.Repository.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SqlP2ApplicationTests {
	@Autowired
	public EmployeeRepo employeeRepo ;

//	@Test
//	void contextLoads() {
//	}

	@Test
	void createEmployee() {
		Employee emp = new Employee() ;
// emp.setId(1);
		emp.setFirstName("Ips");
		emp.setLastName("Singh");
		emp.setSalary(2000);
		emp.setAge(22);

		employeeRepo.save(emp) ;
	}

}
