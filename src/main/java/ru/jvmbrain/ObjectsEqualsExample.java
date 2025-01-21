package ru.jvmbrain;

import java.util.Objects;

public class ObjectsEqualsExample {

    private static final String BUY_TYPE = "BUY";

    public static void main(String[] args) {
        Operation operation = new Operation();

        if (Objects.equals(operation.getType(), BUY_TYPE)) {

        }
    }
}
