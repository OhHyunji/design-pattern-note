package com.headfirst.helloworld;

import com.headfirst.helloworld.behavior.FlyWithWings;

public class DuckSimulator {
    public static void main(String[] args) {

        // 1. simple 청둥오리
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        // 2. 동적으로 행동을 지정
        Duck model = new ModelDuck();
        model.performFly();     //by ModelDuck constructor
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();     //by setter
    }
}

/*
* 객체지향의 기초
* : 캡슐화, 상속, 추상화, 다형성
*
* 객체지향 원칙
* : 바뀌는 부분 => 캡슐화
* : 상속보다는 구성(composition)
* : 인터페이스(type)에 맞춰서 프로그래밍한다.
*
* Strategy Pattern
* : 행동 => 알고리즘군 => 캡슐화
* : 클라이언트(오리)에 독립적으로 알고리즘군(행동)을 변경할 수 있다.
* */