package com.example.designpatterns.structural.bridge;

public class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}
