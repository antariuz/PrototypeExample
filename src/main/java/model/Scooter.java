package model;

public class Scooter implements Cloneable {
    private String brand;
    private int wheels;

    @Override
    public Scooter clone() {
        try {
            return (Scooter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
