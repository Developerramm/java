package com.ram.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
        Emp em = ap.getBean("emp", Emp.class);
        System.out.println(em);
    }
}
