package com.example.SpringCore;

import lombok.Data;

@Data
public class Principal {
    private String Name;
    public void show() {
        System.out.println("I AM IN PRINCIPAL CLASS");
    }

}
