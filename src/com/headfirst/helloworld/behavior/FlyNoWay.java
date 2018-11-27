package com.headfirst.helloworld.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("나는 못날아ㅠㅠ");
    }
}
