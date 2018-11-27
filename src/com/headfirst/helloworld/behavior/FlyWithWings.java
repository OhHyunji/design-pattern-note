package com.headfirst.helloworld.behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고있어요!");
    }
}
