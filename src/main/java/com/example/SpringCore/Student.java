package com.example.SpringCore;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    String name;
    String State;
    public  void run() {
        System.out.println( "I AM IS INSIDE STUDENT CLASS");
    }
    public String string()
    {
        System.out.println("STRING METHOD");
        return "string method";
    }





}

