package Q1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller{
    @RequestMapping(method = RequestMethod.GET , path = "/home")
    public String show(){
        return "Welcome to spring boot" ;
    }

}
