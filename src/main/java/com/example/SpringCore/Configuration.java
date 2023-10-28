package com.example.SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//configuration and componentscan
@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = {" MYPACKAGE,ANOTHERPACKAGE"})
public class Configuration {
    //bean of student class
    @Bean
    public Student getStud()
    {
        System.out.println("get student is executing");
        return new Student();
    }
    @Bean
    public Student createStud()
    {
        System.out.println("create student is executing");
        return new Student();
    }
    //bean of principal class
    @Bean
    public Principal getPrinci(){

        return new Principal();
    }
//bean of employee class
@Bean
    public Employee em()
{
    return new Employee();
}

}
