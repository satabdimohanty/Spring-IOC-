package com.example.spring__IOC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class Student {


    public void run() {
        int a = 8;
        int b = 9;
        System.out.println(a + b);

    }

    public void hell() {
        int n = 10, sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void show() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i * 2);
        }
    }

    public void arr() {
        int a[] = new int[5];
        a[0] = 20;
        a[1] = -34;
        a[2] = 6789;
        a[3] = 67;
        a[4] = 4;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

    public void star() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

        public void doo () {
            int i = 100;

            while (i >= 10) {
                System.out.println(i);
                i--;
            }


        }
        public void hello()
    {
        String s="hello" ;int vowels =0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println(ch);
                 vowels ++;

            }

        }
        System.out.println(vowels);
    }
    }

