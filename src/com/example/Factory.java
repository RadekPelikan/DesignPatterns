package com.example;

public class Factory {

    // Initialized factory
    public Car createBlackOctavia(String SPZ) {
        return new Car("1.9TDI", "Black", "Octavia", SPZ);
    }

    public Car createBlueOctavia(String SPZ) {
        return new Car("1.9TDI", "Blue", "Octavia", SPZ);
    }

    public Car createRedOctavia(String SPZ) {
        return new Car("1.9TDI", "Red", "Octavia", SPZ);
    }

    // Static factory
    /*
    public static Car createBlackOctavia(String SPZ) {
        return new Car("1.9TDI", "Black", "Octavia", SPZ);
    }

    public static Car createBlueOctavia(String SPZ) {
        return new Car("1.9TDI", "Blue", "Octavia", SPZ);
    }

    public static Car createRedOctavia(String SPZ) {
        return new Car("1.9TDI", "Red", "Octavia", SPZ);
    }
    */

}

