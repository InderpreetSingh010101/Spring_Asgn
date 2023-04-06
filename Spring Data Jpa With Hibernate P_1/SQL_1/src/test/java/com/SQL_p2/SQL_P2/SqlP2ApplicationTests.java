package com.SQL_p2.SQL_P2;

import com.SQL_p2.SQL_P2.Entity.Employee;
import com.SQL_p2.SQL_P2.Repository.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class SqlP2ApplicationTests {
@Autowired
	public EmployeeRepo employeeRepo ;
	@Test
	void contextLoads() {
	}
	@Test
	void CreateData() {

		Employee employee  = new Employee() ;

		employee.setName("Himm");
		employee.setAge(28) ;
		employee.setLocation("Mumbai");

		employeeRepo.save(employee) ;

	}
	@Test
	void UpdateData() {

		Employee emp = employeeRepo.findById(3).get() ;
		emp.setName("ABCD");
		emp.setAge(26);
		emp.setLocation("Noida");

		employeeRepo.save(emp) ;


	}
	@Test
	void DeleteData() {

		employeeRepo.deleteById(3); ;


	}
//	@Test
//	void ReadAllData() {
//
//		List<Employee> emp = employeeRepo.findAll() ;
//
//
//		System.out.println(emp);
//
//
//	}
//
	@Test
	void CountData() {

		List<Employee> emp = employeeRepo.findAll() ;
		System.out.println(emp.size());

	}
//	@Test
//	void FindByage() {
//
//		List<Employee> emp = employeeRepo.findByAge(22) ;
//		System.out.println(emp);
//
//	}


	// Q7

	@Test
	public void Sort_Page_On_Age(){
		Pageable pageable = PageRequest.of(0 , 2 , Sort.Direction.DESC ,"age");
//		employeeRepo.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name" ))).forEach(System.out::println);
		Page<Employee> results = employeeRepo.findAll(pageable) ;
		results.forEach(System.out::println);

	}

	// Q8
	@Test
	void FindByName() {

		List<Employee> emp = employeeRepo.findByName("Ips") ;
		System.out.println(emp);

	}


	// (9) Create and use finder to find Employees starting with A character
	@Test
	void FindLikeIn() {

		List<Employee> emp = employeeRepo.findByNameLike("I%") ;
		System.out.println(emp);

	}

	// (10) Create and use finder to find Employees Between the age of 28 to 32

	@Test
	void FindAgeBetweenIn() {

		List<Employee> emp = employeeRepo.findByAgeBetween(22,30) ;
		System.out.println(emp);

	}










// 	>>  >>  Paging  And Sorting Methods  <<  <<

@Test
	public void testFindAllPaging(){
	Pageable pageable = PageRequest.of(0,1) ;

		Page<Employee> result = employeeRepo.findAll(pageable);

		result.forEach(p-> System.out.println(p));
	}

	@Test
	public void SortFindAllPaging(){
	employeeRepo.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name" ))).forEach(System.out::println);
	}

	@Test
	public void SortMutliPropFindAllPaging(){
		employeeRepo.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC,"name" ),new Sort.Order(Sort.Direction.DESC , "location"))).forEach(System.out::println);
	}

}
