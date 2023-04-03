package Q10.controller;

import Q10.DTO.UserDTO;
import Q10.User;
import Q10.UserV2;
import Q10.service.impl.ServiceIMPL;
import Versioning_handsOn.PersonV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


// Create API which saves details of User (along with the password)
// but on successfully saving returns only non-critical data
@RestController

public class controller {
@Autowired
    public ServiceIMPL service ;


 @GetMapping("/users")
 public List<User> getAllUsers(){
     return service.getAllUsersData();
 }


 // URI versioningvv
 @GetMapping("/users/v2")
    public List<UserV2> getAllUsersv2(){
        return service.getAllUsersDataV2();
    }


    // Versioning By Params   Like http://localhost:8080/user?version=2
    @GetMapping(path = "user" , params = "version=2")
    public List<UserV2> getAllUsersv2usingVersioninig(){
        return service.getAllUsersDataV2();
    }



    @GetMapping(path = "user" , headers = "X-API-VERSION=2")
    public List<UserV2> getAllUsersv2Header(){
        return service.getAllUsersDataV2();
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

    @PostMapping("/user/v2")
    public UserV2 postUser(@RequestBody UserV2 userBody){


        System.out.println(userBody.getPassword());
      return service.postUserV2(userBody) ;

    }
}
