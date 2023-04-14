package Q3_4_5_7;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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


    @Operation(summary = "Get All Employees")
    @GetMapping(path = "/employee")
    public List<Employee> getAllEmp(){
        return service.findAll();
    }

    @Operation(summary = "Get Employees on the basis of Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the Employee",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Employee.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Employee not found",
                    content = @Content) })
    @GetMapping(path = "/employee/{id}")
    public Employee getEmpById( @Parameter(description = "Id of the Employee") @PathVariable int id){
        Employee emp  = service.findById(id);
        if(emp == null){
            throw new EmpNotFoundException("For Id.no - " + id ) ;
        }

        return emp ;

    }
    @Operation(summary = "Delete Employee By Id")
    @DeleteMapping (path = "/employee/{id}")
    public ResponseEntity DeleteEmpById(@Parameter(description = "Id of the Employee")@PathVariable int id){

     service.DeleteById(id);

     return new ResponseEntity<>("Done",HttpStatus.OK) ;


    }

    @Operation(summary = "Post new Employee")
    @PostMapping(path = "/employee")
    public Employee postEmployee(@Valid @RequestBody Employee employee){
        return service.postEmployee(employee) ;

    }

    @Operation(summary = "Update Employee By Id")
    @PutMapping (path = "/employee/{id}")
    public Employee putEmployee(@Parameter(description = "Id of the Employee")@PathVariable int id ,@RequestBody Employee employee){
        service.DeleteById(id);
        service.postEmployee(employee) ;
        return service.postEmployee(employee) ;

    }


}
