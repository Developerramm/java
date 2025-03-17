package com.ram;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
        Student st = ap.getBean("st", Student.class);
        System.out.println(st);
    }
}
