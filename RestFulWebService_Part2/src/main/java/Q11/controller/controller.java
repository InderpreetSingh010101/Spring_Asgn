package Q11.controller;

import Q11.DTO.UserDTO;
import Q11.User;
import Q11.service.impl.ServiceIMPL;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


// Create API which saves details of User (along with the password)
// but on successfully saving returns only non-critical data
@RestController

public class controller {
@Autowired
    public ServiceIMPL service ;

 // Using Static Filtering VV  uncomment @JsonIgnore in User class
    @GetMapping("/users1")
    public List<User> getAllUsers(){
       return service.getAllUsersData();
    }


    @GetMapping("/users1/{id}")
    public EntityModel<User> SingleUsers(@PathVariable int id){

        User user = service.getSingleUsersData(id) ;

        EntityModel<User>entityModel = EntityModel.of(user) ;
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers());
        entityModel.add(link.withRel("All_Users")) ;

              return  entityModel ;


    }


    // Using Dynamic fltering vv see in  ServiceIML AND @JsonFiltering()  in User
//    @GetMapping("/users2")
//    public MappingJacksonValue getAllUser(){
//
////        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(User) ;
//
////        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("password");
////        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
////        mappingJacksonValue.setFilters(filters);
//
//        return service.dynamicFiltering() ;
//    }

    @PostMapping("/user")
    public void postUser(@RequestBody UserDTO userBody){


        System.out.println(userBody.getPassword());
        service.postUser(userBody) ;

    }
}
