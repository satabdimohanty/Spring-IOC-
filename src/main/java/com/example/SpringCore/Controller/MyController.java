package com.example.SpringCore.Controller;

import com.example.SpringCore.Principal;
import com.example.SpringCore.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyController {
    //autowiring student class
    @Autowired
    private Student student;
    //autowiring principal class
    @Autowired
    private Principal principal;
    //implemantation of student class
    @RequestMapping(value = "/home",method = RequestMethod.GET)
     @ResponseBody
    public  Student run()

    {
        System.out.println("HERE I AM");
        return student;

    }
    //implementation of principal class
    @RequestMapping(value = "/princi" , method = RequestMethod.GET)
    @ResponseBody
    public Principal principal()
    {

        principal.setName("SATABDI M");
        return principal;
    }
}
