package ru.jvmbrain;

import java.util.Optional;

@SuppressWarnings("all")
public class Main {

    private static Integer defaultCount;

    public static void main(String[] args) {
        System.out.println(returnMultiplyNumber(2));
        System.out.println(returnMultiplyNumber(null));
    }

    public static Integer returnMultiplyNumber(Integer count) {
        return Optional.ofNullable(count)
                .map(current -> current * 2)
                .orElse(defaultCount * 2);
    }
}