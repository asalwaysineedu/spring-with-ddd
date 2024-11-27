package com.example.demo.utility.nickName;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class NicknameUtils {

    // String 배열에서 무조건 하나의 랜덤 String 을 반환한다.
    public static String getRandomNickName(List<String> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    // String 으로 이루어진 배열을 전달받아서 maximumOfPlayer 숫자 만큼의
    // 랜덤 String으로 구성된 List 를 반환한다. 단, 일치하는 값이 없도록 한다.
    public static List<String> getRandomNickNameList(List<String> list, int maximumOfPlayer) {
        List<String> result = new ArrayList<>();

        if (list.size() < maximumOfPlayer) throw new IllegalArgumentException(String.format("생성할 수 있는 플레이어는 최대 %s명 입니다.", list.size()));

        for (int i = 0; i < maximumOfPlayer; i++) {
            String randomNickname = getRandomNickName(list);
            result.add(randomNickname);
            list.remove(randomNickname);
        }
        return result;
    }
}
