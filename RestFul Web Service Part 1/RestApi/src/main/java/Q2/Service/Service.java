package Q2.Service;

import Q2.Entity.Employee;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface Service {
    List<Employee> finaAllEmp();

    Employee getEmpById(int id);

    void DeleteEmpById(int id);

    Employee postEmployee(Employee employee);

    Employee putEmployee(int id, Employee employee);
}
