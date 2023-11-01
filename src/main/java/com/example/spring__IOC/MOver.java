package com.example.spring__IOC;

public class MOver {
    public void run(int a,int b)
    {
        System.out.println(a+b);
    }
    public void run(float c,float d)
    {
        System.out.println(c+d);


    }


    public static void main(String[] args) {
        MOver m=new MOver();
        m.run(1, 1);
        m.run(3.5f, 4.3f);
    }

}
