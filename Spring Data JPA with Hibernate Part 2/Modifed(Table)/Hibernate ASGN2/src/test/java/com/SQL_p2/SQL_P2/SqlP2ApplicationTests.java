package com.SQL_p2.SQL_P2;

import com.SQL_p2.SQL_P2.Entites.Airconditioner;
import com.SQL_p2.SQL_P2.Entites.Employee;
import com.SQL_p2.SQL_P2.Entites.Split_ac;
import com.SQL_p2.SQL_P2.Entites.Window_ac;
import com.SQL_p2.SQL_P2.Repository.AirconditionerRepo;
import com.SQL_p2.SQL_P2.Repository.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class SqlP2ApplicationTests {

	@Autowired
	public EmployeeRepo employeeRepo ;
	@Autowired
	public AirconditionerRepo airconditionerRepo ;
	@Test
	void contextLoads() {
	}
	@Test
	void createEmployee() {
		Employee emp = new Employee() ;

		emp.setFirstName("Ipss");
		emp.setLastName("Singhs");
		emp.setSalary(25300);
		emp.setAge(25);

		employeeRepo.save(emp) ;
	}
// Q1
	@Test
	void findEmpUsingJPA() {
	List<Object[]>objs =  employeeRepo.displaySalwithOrdering()  ;

	for(Object[] obj : objs) {
		System.out.println("FName " +obj[0]);
		System.out.println("LName " +obj[1]);
	    }
	}


	// Q2
	@Test
	@Transactional
	@Rollback(false)
	void updateSal() {
	 employeeRepo.updateSalForLessAvg(20 , 15000);



	}

// Q3
	@Test
	@Transactional
	@Rollback(false)
	void DeleteSal() {
		employeeRepo.deleteWithMinSal(2021);
		System.out.println(employeeRepo.findAll());

	}

	// Native Query
	@Test
	void findLnameUsingNQ(){
		 List<Object[]> result= employeeRepo.findByLastNameNQ();
		 for(Object[] obj : result){
			 System.out.println(obj[0]);
			 System.out.println(obj[1]);
			 System.out.println(obj[2]);
			 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 }
	}

	@Test
	@Transactional
	@Rollback(false)
   void deleteEmpByAge(){
		employeeRepo.deleteEmpOnAge();
	}



	// >>              >>      INHERITANCE MAPPING   <<          <<

// sSINGLE TABLE  STRATEGY
	@Test
	void CreateAcInfo(){
//		Window_ac windowAc = new Window_ac() ;
//		windowAc.setId(1);
//		windowAc.setAmount(10000);
//		windowAc.setWindow_ac_sno("AS1234ERYY");
//		airconditionerRepo.save(windowAc) ;

		Split_ac splitAc = new Split_ac() ;
		splitAc.setId(2);
		splitAc.setAmount(10000);
		splitAc.setSplit_ac_no("SPLT12334ERYY");
		airconditionerRepo.save(splitAc) ;


	}

}
