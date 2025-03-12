package org.example;

public class Ram implements Action {
    @Override
    public void eat() {
        System.out.println("Ram is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Ram is sleeping");
    }
}
