package com.company;

import java.util.Objects;

public class Pants {
    String material;
    String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pants)) return false;
        Pants pants = (Pants) o;
        return Objects.equals(getMaterial(), pants.getMaterial()) &&
                Objects.equals(getColor(), pants.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMaterial(), getColor());
    }

    public Pants(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
