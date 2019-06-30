package com.company;

import java.util.ArrayList;
import java.util.List;

public class Closet {
    private String name;
    private List<Jacket> jacketList = new ArrayList<>();
    private List<Shirt> shirtList = new ArrayList<>();
    private List<Pants> pantsList = new ArrayList<>();
    private List<Shoes> shoesList = new ArrayList<>();

    public Closet(String name) {
        this.name = name;
        this.jacketList.add(new Jacket("C88", "Cotton", "Pink"));
        this.jacketList.add(new Jacket("F18", "Feather", "Blue"));
        this.jacketList.add(new Jacket("Z12", "Leather", "Green"));
        this.jacketList.add(new Jacket("T78", "Polymer", "Silver"));
        this.shirtList.add(new Shirt("T89", "Leather", "Purple"));
        this.shirtList.add(new Shirt("Y01", "Nano", "Rainbow"));
        this.shirtList.add(new Shirt("U77", "Plastic", "Torque"));
        this.shirtList.add(new Shirt("I37", "Fabric", "Orange"));
        this.pantsList.add(new Pants("O61", "Wool", "Maroon"));
        this.pantsList.add(new Pants("R22", "Synthetic Fiber", "Teal"));
        this.pantsList.add(new Pants("E31", "Flax Plant", "Navy"));
        this.pantsList.add(new Pants("O11", "Polyester", "Lime"));
        this.shoesList.add(new Shoes("Flip Flop", "Polyester", "Beige"));
        this.shoesList.add(new Shoes("Sandals", "Foam", "Cyan"));
        this.shoesList.add(new Shoes("Boots", "Rubber", "Mint"));
        this.shoesList.add(new Shoes("Dress Shoes", "Leather", "Magenta"));
    }

    public List<Jacket> getJacketList() {
        return jacketList;
    }

    public void setJacketList(List<Jacket> jacketList) {
        this.jacketList = jacketList;
    }

    public List<Shirt> getShirtList() {
        return shirtList;
    }

    public void setShirtList(List<Shirt> shirtList) {
        this.shirtList = shirtList;
    }

    public List<Pants> getPantsList() {
        return pantsList;
    }

    public void setPantsList(List<Pants> pantsList) {
        this.pantsList = pantsList;
    }

    public List<Shoes> getShoesList() {
        return shoesList;
    }

    public void setShoesList(List<Shoes> shoesList) {
        this.shoesList = shoesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String jackets = "";
        String shirts = "";
        String pants = "";
        String shoes = "";
        for (int i = 0; i < this.jacketList.size(); i++) {
            jackets += this.jacketList.get(i);
            shirts += this.shirtList.get(i);
            pants += this.pantsList.get(i);
            shoes += this.shoesList.get(i);
        }
        return "\t\t\t\tCLOSET " + this.name.toUpperCase() + "\n" +
                "List of Jackets: \n" + jackets + "\n=====================================================\n" +
                "List of Shirts: \n" + shirts + "\n=====================================================\n" +
                "List of Pants: \n" + pants + "\n=====================================================\n" +
                "List of Shoes: \n" + shoes + "\n=====================================================\n";
//        return "List of Jackets: \n" + this.jacketList.toString() + "\n=====================================\n" +
//                "List of Shirts: \n" + this.shirtList.toString() + "\n=====================================\n" +
//                "List of Pants: \n" + this.pantsList.toString() + "\n=====================================\n" +
//                "List of Shoes: \n" + this.shoesList.toString() + "\n=====================================\n";
    }
}

//    private Jacket jacket;
//    private Shirt shirt;
//    private Pants pants;
//    private Shoes shoes;
//
//    public Closet(String name, Jacket jacket, Shirt shirt, Pants pants, Shoes shoes) {
//        this.name = name;
//        this.jacket = jacket;
//        this.shirt = shirt;
//        this.pants = pants;
//        this.shoes = shoes;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Jacket getJacket() {
//        return jacket;
//    }
//
//    public void setJacket(Jacket jacket) {
//        this.jacket = jacket;
//    }
//
//    public Shirt getShirt() {
//        return shirt;
//    }
//
//    public void setShirt(Shirt shirt) {
//        this.shirt = shirt;
//    }
//
//    public Pants getPants() {
//        return pants;
//    }
//
//    public void setPants(Pants pants) {
//        this.pants = pants;
//    }
//
//    public Shoes getShoes() {
//        return shoes;
//    }
//
//    public void setShoes(Shoes shoes) {
//        this.shoes = shoes;
//    }
//        StringBuilder warpUp = new StringBuilder();
//        StringBuilder jacket = new StringBuilder();
//        StringBuilder shirt = new StringBuilder();
//        StringBuilder pants = new StringBuilder();
//        StringBuilder shoes = new StringBuilder();
//        String closetName = this.name + " closet has: \n";
//                "Jacket: " + this.jacketList + "\n" +
//                "Shirt: " + this.shirtList + "\n" +
//                "Pants: " + this.pantsList + "\n" +
//                "Shoes: " + this.shoesList + "\n";
//        for (int i = 0; i < this.jacketList.size(); i++) {
//            jacket.append(this.jacketList.get(i) + " \n");
//            shirt.append(this.shirtList.get(i) + " \n");
//            pants.append(this.pantsList.get(i) + " \n");
//            shoes.append(this.shoesList.get(i) + "\n");
////            warpUp.append(jacket + shirt + pants + shoes + "\n");
//        }
