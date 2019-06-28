package com.company;

import java.util.Objects;

public class Shoes {
    String kindOfShoes;
    String material;
    String color;
// shoes1(flipflop, cotton, red)
    //shoes2(flipflop, cotton, red)
    //shoes1.equals(shoes2) true
    //without the equals and hashcode false
//    public Shoes(String material, String color) {
//        this.material = material;
//        this.color = color;
//    }

    public Shoes(String kindOfShoes, String material, String color) {
        this.kindOfShoes = kindOfShoes;
        this.material = material;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shoes)) return false;
        Shoes shoes = (Shoes) o;
        return Objects.equals(getKindOfShoes(), shoes.getKindOfShoes()) &&
                Objects.equals(getMaterial(), shoes.getMaterial()) &&
                Objects.equals(getColor(), shoes.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getKindOfShoes(), getMaterial(), getColor());
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "kindOfShoes='" + kindOfShoes + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getKindOfShoes() {
        return kindOfShoes;
    }

    public void setKindOfShoes(String kindOfShoes) {
        this.kindOfShoes = kindOfShoes;
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

}
