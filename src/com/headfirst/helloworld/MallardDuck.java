package com.headfirst.helloworld;

import com.headfirst.helloworld.behavior.FlyWithWings;
import com.headfirst.helloworld.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("나는야 청둥오리");
    }
}
