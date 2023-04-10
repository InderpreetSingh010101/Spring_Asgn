package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    public EmailService emailService ;
    @Mock
    public Order order = new Order(1,"abc",1d) ;



    @InjectMocks
    OrderService orderService ;

    @Test()
    public void test_placeOrder_exception(){
        //Given
//        OrderService orderService = new OrderService() ;

        //when
        orderService.placeOrder(order);

//        when(emailService.sendEmail(order)).thenThrow(new RuntimeException("An Exception Occurred")) ;
        verify(emailService ).sendEmail(order);
    }

    @Test
    public void test_boolean_placeOrder(){
  String cc = "ANCD" ;

       when(emailService.sendEmail(order , cc)).thenReturn(true) ;

        assertTrue(orderService.placeOrder(order , cc)); ;
    }



}