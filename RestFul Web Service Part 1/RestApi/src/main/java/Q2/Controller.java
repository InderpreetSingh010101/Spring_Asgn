package Q2;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private EmployeeDAO service ;

    @GetMapping(path = "/employee")
    public List<Employee> getAllEmp(){
        return service.findAll();
    }

    @GetMapping(path = "/employee/{id}")
    public Employee getEmpById(@PathVariable int id){
        Employee emp  = service.findById(id);
        if(emp == null){
            throw new EmpNotFoundException("For Id.no - " + id ) ;
        }

        return emp ;

    }

    @DeleteMapping (path = "/employee/{id}")
    public ResponseEntity DeleteEmpById(@PathVariable int id){

     service.DeleteById(id);

     return new ResponseEntity<>("Done",HttpStatus.OK) ;


    }
    @PostMapping(path = "/employee")
    public Employee postEmployee(@Valid @RequestBody Employee employee){
        return service.postEmployee(employee) ;

    }

    @PutMapping (path = "/employee/{id}")
    public Employee putEmployee(@PathVariable int id ,@RequestBody Employee employee){
        service.DeleteById(id);
        service.postEmployee(employee) ;
        return service.postEmployee(employee) ;

    }


}
