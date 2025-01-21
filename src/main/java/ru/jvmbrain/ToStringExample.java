package ru.jvmbrain;

public class ToStringExample {

    public static void main(String[] args) {
        User user = null;

        String strObject = String.valueOf(user); //return "null" if myObject == null

        //OR

        String strObjectNullable = user == null ? null : user.toString();
    }
}
