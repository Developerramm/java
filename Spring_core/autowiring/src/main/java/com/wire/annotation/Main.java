package com.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
        Student st = ap.getBean("st", Student.class);
        System.out.println(st);
    }
}
