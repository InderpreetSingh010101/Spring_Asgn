package com.Q1.q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class All_Impl {
@Autowired
    private  InterF interF ;


    // Constructor Injection
    All_Impl(InterF interF){
        this.interF = interF ;
    }

    public void printShow(){
        interF.show();
    }

}
