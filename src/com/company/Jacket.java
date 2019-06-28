package com.company;

import java.util.Objects;

public class Jacket {
    String material;
    String color;

    public Jacket(String material, String color) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jacket)) return false;
        Jacket jacket = (Jacket) o;
        return Objects.equals(getMaterial(), jacket.getMaterial()) &&
                Objects.equals(getColor(), jacket.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMaterial(), getColor());
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
