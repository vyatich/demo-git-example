package ru.jvmbrain;

import java.util.Optional;

public class OptionalOf {

    static String name;

    public static void main(String[] args) {

        Optional<String> optOfNull = Optional.of(name);
        Optional<String> optOfNullable = Optional.ofNullable(name);
    }
}
