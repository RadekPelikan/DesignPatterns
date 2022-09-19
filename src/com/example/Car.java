package com.example;

public class Car {
    private String engine;
    private String color;
    private String type;
    private String SPZ;

    public Car(String engine, String color, String type, String SPZ) {
        this.engine = engine;
        this.color = color;
        this.type = type;
        this.SPZ = SPZ;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        this.SPZ = SPZ;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", SPZ='" + SPZ + '\'' +
                '}';
    }
}
