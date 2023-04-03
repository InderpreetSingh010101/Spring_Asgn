package Q3_4_5_7;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDAO {

    private static List<Employee> employeeList = new ArrayList<>() ;

    static {
        employeeList.add(new Employee(1,"Ips" , 22));
        employeeList.add(new Employee(2,"Raghav" , 32));
        employeeList.add(new Employee(3,"Jim" , 25));
    }

    public List<Employee> findAll(){
        return employeeList ;
    }

    public Employee findById(int id){
       return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null) ;
    }
    public void DeleteById(int id){
      employeeList =  employeeList.stream().filter(e -> e.getId() != id)
                .collect(Collectors.toList());
    }


    public Employee postEmployee(Employee emp){
        employeeList.add(emp) ;
        return emp ;
    }



}
