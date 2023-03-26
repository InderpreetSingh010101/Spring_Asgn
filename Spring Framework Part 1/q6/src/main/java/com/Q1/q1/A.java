package com.Q1.q1;

import org.springframework.stereotype.Component;

@Component
public class A implements InterF{

    @Override
    public void show() {
        System.out.println("Constructor Injector Is Used");
    }
}
