package com.bridgelabz;

public class TestMax<T> {
    public <T extends Comparable<T>> T maxValue(T x, T y, T z) {
        T maxvalue = x;
        if (y.compareTo(maxvalue) > 0) {
            maxvalue = y;
        }
        if (z.compareTo(maxvalue) > 0) {
            maxvalue = z;
        }
        return maxvalue;
    }
}
