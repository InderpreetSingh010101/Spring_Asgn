package Q2.Controller;

import Q2.Dao.DaoImpl.EmployeeDAO;
import Q2.Entity.Employee;
import Q2.ErrorHandling.EmpNotFoundException;
import Q2.Service.Impl.ServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
//    @Autowired
//    private EmployeeDAO service ;
    @Autowired
    private ServiceImpl serviceimpl ;

    @GetMapping(path = "/employee")
    public List<Employee> getAllEmp(){
        return serviceimpl.finaAllEmp();
        //return service.findAll();
    }

    @GetMapping(path = "/employee/{id}/{name}")
    public Employee getEmpById(@PathVariable int id , @PathVariable String name){
//        Employee emp  = service.findById(id);
//        if(emp == null){
//            throw new EmpNotFoundException("For Id.no - " + id ) ;
//        }
//
//        return emp ;
        System.out.println(name);
        return serviceimpl.getEmpById(id);

    }

    @DeleteMapping (path = "/employee/{id}")
    public ResponseEntity DeleteEmpById(@PathVariable int id){

//     service.DeleteById(id);

        serviceimpl.DeleteEmpById(id);

     return new ResponseEntity<>("Done",HttpStatus.OK) ;


    }
    @PostMapping(path = "/employee")
    public Employee postEmployee(@Valid @RequestBody Employee employee){
//        return service.postEmployee(employee) ;

        return serviceimpl.postEmployee(employee);

    }

    @PutMapping (path = "/employee/{id}")
    public Employee putEmployee(@PathVariable int id ,@RequestBody Employee employee){
//        service.DeleteById(id);
//        service.postEmployee(employee) ;
//        return service.postEmployee(employee) ;
        return serviceimpl.putEmployee(id , employee);

    }


}
