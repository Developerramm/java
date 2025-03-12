package com.ram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
        Ram ram = ap.getBean(Ram.class);
        ram.sleep();
        ram.eat();
        Shyam sm = ap.getBean(Shyam.class);
        sm.eat();
        sm.sleep();
    }
}
