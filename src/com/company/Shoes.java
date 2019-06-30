package com.company;

import java.util.Objects;

public class Shoes {
    String kindOfShoes;
    String material;
    String color;

    public Shoes(String kindOfShoes, String material, String color) {
        this.kindOfShoes = kindOfShoes;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        String listString;
        listString = "Kind of shoes: " + this.kindOfShoes + " made with " + this.material + " with the color of " + this.color + "\n";
        return listString;
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
