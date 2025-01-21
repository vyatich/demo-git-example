package ru.jvmbrain;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    private static int factorial(int n) {
        return n * factorial(n-1);
    }
}
