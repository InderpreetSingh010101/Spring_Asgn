package Q2.Service.Impl;

import Q2.Dao.DaoImpl.EmployeeDAO;
import Q2.Entity.Employee;
import Q2.ErrorHandling.EmpNotFoundException;
import Q2.Service.Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class ServiceImpl implements Service {

    @Autowired
    private EmployeeDAO service ;

    @Override
    public List<Employee> finaAllEmp(){
        return service.findAll();
    }
@Override
    public Employee getEmpById(int id){
        Employee emp  = service.findById(id);
        if(emp == null){
            throw new EmpNotFoundException("For Id.no - " + id ) ;
        }

        return emp ;

    }
@Override
    public void DeleteEmpById( int id){

        service.DeleteById(id);




    }
@Override
    public Employee postEmployee( Employee employee){
        return service.postEmployee(employee) ;

    }
@Override
    public Employee putEmployee( int id ,Employee employee){
        service.DeleteById(id);
        service.postEmployee(employee) ;
        return service.postEmployee(employee) ;

    }
}
