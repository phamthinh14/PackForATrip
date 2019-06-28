package com.company;

import java.util.Objects;

public class Shirt {
    String material;
    String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shirt)) return false;
        Shirt shirt = (Shirt) o;
        return Objects.equals(getMaterial(), shirt.getMaterial()) &&
                Objects.equals(getColor(), shirt.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getMaterial(), getColor());
    }

    public Shirt(String material, String color) {
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
        return "Shirt{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
