package ru.jvmbrain;

import java.util.ArrayList;
import java.util.List;

public class ImmutableCollection {

    public static void main(String[] args) {
        List<String> immutableNames = List.of("Ivan", "Vladimir");
        List<String> names = new ArrayList<>(immutableNames);

        System.out.println(isContains(names, null));
        System.out.println(isContains(immutableNames, null));

    }

    private static boolean isContains(List<String> list, String element) {
        //do something
        return list.contains(element);
    }
}
