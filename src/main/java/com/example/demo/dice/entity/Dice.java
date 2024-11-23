package com.example.demo.dice.entity;

import lombok.Getter;

// Entity안에 상태 값을 배치함.
// 이 상태 값을 획득하고 싶을 때 사용하는 것이 Getter
// @Getter 를 사용하여 getNumber() 메서드(함수)가 자동으로 생성됨.
@Getter
public class Dice {

    private int number;

    public Dice(int number) {
        this.number = number;
    }
}
