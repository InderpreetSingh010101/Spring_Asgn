package Q8_9.controller;

import Q8_9.DTO.UserDTO;
import Q8_9.User;
import Q8_9.service.impl.ServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


// Create API which saves details of User (along with the password)
// but on successfully saving returns only non-critical data
@RestController

public class Controller {
@Autowired
    public ServiceIMPL service ;

 // Using Static Filtering VV  uncomment @JsonIgnore in User class
    @GetMapping("/users1")
    public List<User> getAllUsers(){
       return service.getAllUsersData();
    }

    // Using Dynamic fltering vv see in  ServiceIML AND @JsonFiltering()  in User
    @GetMapping("/users2")
    public MappingJacksonValue getAllUser(){

//        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(User) ;

//        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("password");
//        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
//        mappingJacksonValue.setFilters(filters);

        return service.dynamicFiltering() ;
    }

    @PostMapping("/user")
    public void postUser(@RequestBody UserDTO userBody){


        System.out.println(userBody.getPassword());
        service.postUser(userBody) ;

    }
}
