package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Mock
    Order order = new Order(1,"IPS_S" , 12) ;

    @InjectMocks
    EmailService emailService ;

    @Test(expected = RuntimeException.class)
    public void test_setEmailService(){
        emailService.sendEmail(order);
    }
    @Test
    public void test_sendEmailWithCC(){
        String cc = "DUMMY" ;
        assertTrue(emailService.sendEmail(order , cc)) ;
    }




}