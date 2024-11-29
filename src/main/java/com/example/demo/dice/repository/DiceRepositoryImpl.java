package com.example.demo.dice.repository;

import com.example.demo.dice.entity.Dice;
import org.springframework.stereotype.Repository;

// Spring Beans
// Spring Core가 IoC Contailner를 관리하는데
// @Controller, @Service, @Repository 붙은 애들이 결국 Beans
// @Repository 라는 것을 알려줌
// 이거 싱글톤이니까 알아서 RequiredArgsConstructor가 인식하도록 만들어라 명령하는것임.
@Repository
public class DiceRepositoryImpl implements DiceRepository{
    final int MIN = 1;
    final int MAX = 6;
    int id = 0;

    private int createdRandomNumber() {
        int randomNumber = (int) (Math.random() * MAX) + MIN;
        return randomNumber;
    }

    @Override
    public Dice rollDice() {
        int randomNumber = createdRandomNumber();
        Dice dice = new Dice((long) ++id, randomNumber);

        return dice;
    }
}
