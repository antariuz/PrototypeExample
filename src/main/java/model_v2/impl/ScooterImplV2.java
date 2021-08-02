package model_v2.impl;

import model_v2.ScooterV2;

public class ScooterImplV2 implements ScooterV2 {
    private final String brand;
    private final int wheels;

    public ScooterImplV2(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    @Override
    public Object copy() {
        return new ScooterImplV2(brand, wheels);
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
