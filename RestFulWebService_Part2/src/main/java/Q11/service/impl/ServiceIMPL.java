package Q11.service.impl;

import Q11.DTO.UserDTO;
import Q11.User;
import Q11.service.Service;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceIMPL implements Service {

    private static List<User> usersList = new ArrayList<>();
//    static {
//        usersList.add(new User(1,"ips@ii.com","IPS Singh" , "qwertyuiop"));
//        usersList.add(new User(2,"pp@ii.com","Ragav Saini" , "asdfghjkl"));
//        usersList.add(new User(3,"pal@ii.com","Paal Singh" , "zxcvbnm"));
//
//    }


    @Override
    public List<User> getAllUsersData() {
        return usersList;
    }

    @Override
    public User getSingleUsersData(int id) {

       return usersList.stream().filter(user -> user.getId() == id).findFirst().orElse(null) ;
    }



    @Override
    public User postUser(UserDTO userBody){
        User sUser = new User() ;
        sUser.setName(userBody.getName());
        sUser.setId(userBody.getId());
        sUser.setEmail(userBody.getEmail()) ;
        sUser.setPassword(userBody.getPassword());

        usersList.add(sUser) ;
        System.out.println(usersList);
        return sUser ;
    }

    public MappingJacksonValue dynamicFiltering(){
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(usersList) ;

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id" , "email" , "name");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }
}
