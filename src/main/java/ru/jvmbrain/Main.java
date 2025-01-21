package ru.jvmbrain;

import java.nio.charset.Charset;
import java.util.Optional;
import java.util.Random;

@SuppressWarnings("all")
public class Main {

    private static final Random random = new Random();
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

    public static String getRandom(int length) {
        byte[] array = new byte[length];
        random.nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}