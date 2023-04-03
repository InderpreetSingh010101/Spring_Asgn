package Versioning_handsOn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSrvices_versioning {


    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){

        return new PersonV1("IPs Singh") ;

    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondverionOfPerson(){

        return new PersonV2(new Name("Ips" , "Singh"));
    }

     // using params
    @GetMapping(path = "person" , params = "version=3")
    public PersonV2 getthirsverionOfPerson(){

        return new PersonV2(new Name("Ips" , "Singh"));
    }
    @GetMapping(path = "person" , headers = "X-API-VERSION=4")
    public PersonV2 getfOURTHsverionOfPerson(){

        return new PersonV2(new Name("Ips" , "Singh"));
    }

//    @GetMapping(path = "person" , headers = "X-API-VERSION=4")
//    public PersonV2 getfOURTHsverionOfPerson(){
//
//        return new PersonV2(new Name("Ips" , "Singh"));
//    }

}
