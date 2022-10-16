package com.bridgelabz;

public class TestMax {
    public static int maxInt(Integer x, Integer y, Integer z) {
        Integer maxValue = x;
        if (y.compareTo(maxValue) > 0) {
            maxValue = y;
        }
        if (z.compareTo(maxValue) > 0) {
            maxValue = z;
        }
        return maxValue;
    }
    public static Float maxFloat(Float x, Float y, Float z) {
        Float maxValue = x;
        if (y.compareTo(maxValue) > 0) {
            maxValue = y;
        }
        if (z.compareTo(maxValue) > 0) {
            maxValue = z;
        }
        return maxValue;
    }
}
