package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Controller {

    private final int THREE = 3;
    private String closetName;
    private List<Jacket> jacketList = new ArrayList<>();
    private List<Shirt> shirtList = new ArrayList<>();
    private List<Pants> pantsList = new ArrayList<>();
    private List<Shoes> shoesList = new ArrayList<>();
    private List<Closet> closetsList = new ArrayList<>();

    public Controller() {
        this.jacketList.add(new Jacket("cotton", "blue"));
        this.jacketList.add(new Jacket("linen", "Opal"));
        this.jacketList.add(new Jacket("feather", "red"));
        this.shirtList.add(new Shirt("linen", "black"));
        this.shirtList.add(new Shirt("feather", "red"));
        this.shirtList.add(new Shirt("cotton", "blue"));
        this.pantsList.add(new Pants("feather", "red"));
        this.pantsList.add(new Pants("linen", "black"));
        this.pantsList.add(new Pants("cotton", "blue"));
        this.shoesList.add(new Shoes("snicker", "feather", "green"));
        this.shoesList.add(new Shoes("flip flop", "feather", "red"));
        this.shoesList.add(new Shoes("sandal", "feather", "black"));
    }

    public void GenerateCloset() {
        int randomNum = 0;
        String closetName;

        System.out.println("Input three closets name");
        for (int i = 0; i < THREE; i++) {
            randomNum = new Random().nextInt(THREE);
            closetName = new Scanner(System.in).nextLine();

            this.closetsList.add(new Closet(closetName, this.jacketList.get(randomNum), this.shirtList.get(randomNum), this.pantsList.get(randomNum), this.shoesList.get(randomNum)));
//            this.closetsList.add(closetName, this.jacketList.get(i), this.shirtList.get(i), this.pantsList.get(i), this.shoesList.get(i));
        }

        System.out.println("Here are three suggestion for you to pack: ");
        for (int i = 0; i < this.closetsList.size(); i++) {
            System.out.println(this.closetsList.get(i).toString());
        }
    }

    public void SelectSuitCase() {
        String userInput;
        String userInput2;
        int randomNum = 0;
        System.out.println("Enter the closet you want to pack: ");
        userInput = new Scanner(System.in).nextLine();
        for (int i = 0; i < this.closetsList.size(); i++) {
            if (this.closetsList.get(i).getName().equalsIgnoreCase(userInput)) {
                if (this.closetsList.get(i).getShoes().getKindOfShoes().equalsIgnoreCase("flip flop")) {
                    System.out.println("Do you want to add other kind of shoes?");
                    userInput2 = new Scanner(System.in).nextLine();
                    if (userInput2.equalsIgnoreCase("yes")) {
                        randomNum = new Random().nextInt(THREE);
                        while (this.shoesList.get(randomNum).getKindOfShoes().equalsIgnoreCase("flip flop")) {
                            randomNum = new Random().nextInt(THREE);
                        }
                        this.closetsList.add(new Closet(this.closetsList.get(i).getName(), this.jacketList.get(randomNum), this.shirtList.get(randomNum), this.pantsList.get(randomNum), this.shoesList.get(randomNum)));
                    }
                    if (!userInput2.equalsIgnoreCase("yes")){
                        System.out.println("Program End");
                    }

                }
            }
        }
    }

    public void DisplaySuitCaseByName() {
        String userInput;
        System.out.println("Enter the suitcase you want to look for: ");
        userInput = new Scanner(System.in).nextLine();
        for (int i = 0; i < this.closetsList.size(); i++) {
            if (this.closetsList.get(i).getName().equalsIgnoreCase(userInput)) {
                System.out.println(this.closetsList.get(i).toString());
            }
        }
    }

//    public void DisplayShoesByName(){
//        String userInput;
//        System.out.println("Enter the suitcase you want to look for: ");
//        userInput = new Scanner(System.in).nextLine();
//        for (int i = 0; i < this.closetsList.size(); i++) {
//            if (this.closetsList.get(i).getName().equalsIgnoreCase(userInput)) {
//                System.out.println(this.closetsList.get(i).toString());
//            }
//        }
//    }


//    private List<Jacket> AddingJackets() {
//        int randomNum = 0;
//        for (int i = 0; i < THREE; i++) {
//            randomNum = new Random().nextInt(THREE);
//        }
//        switch (randomNum) {
//            case 0:
//                this.jacketList.add(new Jacket("cotton", "blue"));
//                break;
//            case 1:
//                this.jacketList.add(new Jacket("linen", "Opal"));
//                break;
//            case 2:
//                this.jacketList.add(new Jacket("feather", "red"));
//                break;
//        }
////        }
//        return jacketList;
//    }

//    private List<Shirt> AddingShirts() {
//        int randomNum = 0;
//        for (int i = 0; i < THREE; i++) {
//            randomNum = new Random().nextInt(THREE);
//        }
//        switch (randomNum) {
//            case 0:
//                this.shirtList.add(new Shirt("linen", "black"));
//
//            case 1:
//                this.shirtList.add(new Shirt("feather", "red"));
//
//            case 2:
//                this.shirtList.add(new Shirt("cotton", "blue"));
//                break;
//        }
//        return shirtList;
//    }
//        return null;


//    private List<Pants> AddingPants() {
//        int randomNum = 0;
//        for (int i = 0; i < THREE; i++) {
//            randomNum = new Random().nextInt(THREE);
//        }
//        switch (randomNum) {
//            case 0:
//                this.pantsList.add(new Pants("feather", "red"));
//                break;
//            case 1:
//                this.pantsList.add(new Pants("linen", "black"));
//                break;
//            case 2:
//                this.pantsList.add(new Pants("cotton", "blue"));
//                break;
//        }
////        }
//        return pantsList;
//    }

//    private List<Shoes> AddingShoes() {
//        int randomNum = 0;
//        for (int i = 0; i < THREE; i++) {
//            randomNum = new Random().nextInt(THREE);
//        }
//        switch (randomNum) {
//            case 0:
//                this.shoesList.add(new Shoes("snicker", "feather", "green"));
//                break;
//            case 1:
//                this.shoesList.add(new Shoes("flip flop", "feather", "red"));
//                break;
//            case 2:
//                this.shoesList.add(new Shoes("sandal", "feather", "black"));
//                break;
//        }
////        }
//        return shoesList;
//    }


}

