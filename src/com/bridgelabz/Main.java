package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        Integer integerValue = MaximumTest.maxValue(10, 20, 30);
        System.out.println("Maximum value in integer is :" + integerValue);

        Float floatValue = MaximumTest.maxValue(12.3f, 14.5f, 19.99f);
        System.out.println("Maximum value in float is : " + floatValue);

        String stringValue = MaximumTest.maxValue("Apple", "Peach", "Banana");
        System.out.println("Maximum value in string is : " + stringValue);
    }
}
