package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        TestMax<Integer> integerTestMax = new TestMax<>();
        int intValue = integerTestMax.maxValue(2, 5, 7);
        System.out.println("Maximum value in integer : " + intValue);

        TestMax<Float> floatTestMax = new TestMax<>();
        float floatValue = floatTestMax.maxValue(2.3f, 4.5f, 9.99f);
        System.out.println("Maximum value in float : " + floatValue);

        TestMax<String> stringTestMax = new TestMax<>();
        String stringValue = stringTestMax.maxValue("Apple", "Peach", "Banana");
        System.out.println("Maximum value in string : " + stringValue);
    }
}
