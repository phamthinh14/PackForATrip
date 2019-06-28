package com.company;

import java.util.ArrayList;
import java.util.List;

public class Closet {
    private String name;
    //    private List<Jacket> jacketList = new ArrayList<>();
//    private List<Shirt> shirtList = new ArrayList<>();
//    private List<Pants> pantsList = new ArrayList<>();
//    private List<Shoes> shoesList = new ArrayList<>();
    private Jacket jacket;
    private Shirt shirt;
    private Pants pants;
    private Shoes shoes;

    public Closet(String name, Jacket jacket, Shirt shirt, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    //    public Closet(String name, List<Jacket> jacketList, List<Shirt> shirtList, List<Pants> pantsList, List<Shoes> shoesList) {
//        this.name = name;
//        this.jacketList = jacketList;
//        this.shirtList = shirtList;
//        this.pantsList = pantsList;
//        this.shoesList = shoesList;
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
//    public List<Jacket> getJacketList() {
//        return jacketList;
//    }
//
//    public void setJacketList(List<Jacket> jacketList) {
//        this.jacketList = jacketList;
//    }
//
//    public List<Shirt> getShirtList() {
//        return shirtList;
//    }
//
//    public void setShirtList(List<Shirt> shirtList) {
//        this.shirtList = shirtList;
//    }
//
//    public List<Pants> getPantsList() {
//        return pantsList;
//    }
//
//    public void setPantsList(List<Pants> pantsList) {
//        this.pantsList = pantsList;
//    }
//
//    public List<Shoes> getShoesList() {
//        return shoesList;
//    }
//
//    public void setShoesList(List<Shoes> shoesList) {
//        this.shoesList = shoesList;
//    }

    @Override
    public String toString() {
//        StringBuilder warpUp = new StringBuilder();
//        StringBuilder jacket = new StringBuilder();
//        StringBuilder shirt = new StringBuilder();
//        StringBuilder pants = new StringBuilder();
//        StringBuilder shoes = new StringBuilder();
        String closetName = this.name + " closet has: \n";
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
        return closetName + jacket.toString() + shirt.toString() + pants.toString() + shoes.toString() + "\n";
    }
}
