package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        int intValue = TestMax.maxInt(20, 70, 60);
        System.out.println("Maximum value in integer is : " + intValue);

        float floatValue = TestMax.maxFloat(10.5f, 20.01f, 30.9f);
        System.out.println("Maximum value in float is : " + floatValue);
    }
}
