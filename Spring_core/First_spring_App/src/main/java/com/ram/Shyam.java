package com.ram;

public class Shyam implements Action{

    public Shyam(){
        System.out.println("Shyam default contructor");
    }
    @Override
    public void eat() {
        System.out.println("Shyam is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Shyam is sleeping");
    }
}
