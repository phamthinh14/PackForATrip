package com.company;

import java.util.Objects;

public class Pants {
    private String id;
    private String material;
    private String color;

    public Pants(String id, String material, String color) {
        this.id = id;
        this.material = material;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        String listString;
        listString = "Pant ID: " + this.id + " made with " + this.material + " with the color of " + this.color + "\n";
        return listString;
    }
}
