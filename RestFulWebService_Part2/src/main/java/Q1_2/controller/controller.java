package Q1_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class controller{
    @Autowired
    private MessageSource messageSource ;
    @RequestMapping(method = RequestMethod.GET , path = "/home/{name}")
    public String show(@PathVariable String name){
        Locale locale = LocaleContextHolder.getLocale() ;
        return messageSource.getMessage("hello.message" , null , "Default Message" , locale) + " " +name;

    }

}
