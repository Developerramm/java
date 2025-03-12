package com.ram;

public class Ram implements Action{
    public Ram(){
        System.out.println("Ram default contructor");
    }
    @Override
    public void eat() {
        System.out.println("Ram is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Ram is sleeping");
    }
}
