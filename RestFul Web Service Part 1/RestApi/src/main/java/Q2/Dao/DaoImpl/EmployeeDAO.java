package Q2.Dao.DaoImpl;

import Q2.Dao.EmployDao;
import Q2.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDAO implements EmployDao {

    private static List<Employee> employeeList = new ArrayList<>() ;

    static {
        employeeList.add(new Employee(1,"Ips" , 22));
        employeeList.add(new Employee(2,"Raghav" , 32));
        employeeList.add(new Employee(3,"Jim" , 25));
    }
@Override
    public List<Employee> findAll(){
        return employeeList ;
    }
@Override
    public Employee findById(int id){
       return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null) ;
    }
    @Override
    public void DeleteById(int id){
      employeeList =  employeeList.stream().filter(e -> e.getId() != id)
                .collect(Collectors.toList());
    }

@Override
    public Employee postEmployee(Employee emp){
        employeeList.add(emp) ;
        return emp ;
    }



}
