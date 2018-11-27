package com.headfirst.helloworld;

import com.headfirst.helloworld.behavior.FlyNoWay;
import com.headfirst.helloworld.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("나는야 모형오리");
    }
}
