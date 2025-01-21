package ru.jvmbrain;

import java.util.Optional;
import java.util.Random;

@SuppressWarnings("all")
public class Main {

    private static Integer defaultCount;
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println(returnMultiplyNumber(2));
        System.out.println(returnMultiplyNumber(null));
    }

    public static Integer returnMultiplyNumber(Integer count) {
        return Optional.ofNullable(count)
                .map(current -> current * 2)
                .orElse(defaultCount * 2);
    }

    public static Integer getRandom() {
        return random.nextInt();
    }
}