package ru.jvmbrain;

import java.util.Set;

public class SetContains {

    public static void main(String[] args) {
        Set<String> names = Set.of("Vlad", "Anna");

        System.out.println(names.contains("Vlad"));
        System.out.println(names.contains(null));
    }
}
