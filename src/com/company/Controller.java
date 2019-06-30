package com.company;

import java.util.*;

public class Controller {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private boolean isFlipFlop = false;
    private List<Closet> closetList = new ArrayList<>();
    private List<String> suitCase = new ArrayList<>();
    private List<Shoes> trackingShoes = new ArrayList<>();
    private Closet closet;

    public Controller() {
        AskNameClosets();
        PackCloth();
    }

    public void AskNameClosets() {
        String userInput;
        System.out.println("Type in three names for your three closet: ");
        for (int i = 0; i < 3; i++) {
            userInput = new Scanner(System.in).nextLine();
            //^ is the beginning of string anchor.
            //$ is the end of string anchor.
            //\s is the whitespace character class.
            //* is zero-or-more repetition of.
            while (userInput.matches("^\\s*$")) {
                System.out.println("Name cannot be blank. Please type again: ");
                userInput = new Scanner(System.in).nextLine();
            }
            closetList.add(this.closet = new Closet(userInput));
            Collections.shuffle(this.closet.getJacketList());
            Collections.shuffle(this.closet.getShirtList());
            Collections.shuffle(this.closet.getPantsList());
            Collections.shuffle(this.closet.getShoesList());
            System.out.println("Closet " + userInput + " has been created");
        }
        System.out.println("Below is the list of three closets: ");
        this.closetList.stream().forEach(System.out::println);
    }

    public void PackCloth() {
        boolean isInList = false;
        String userInput = "";
        int closetIndexToPack = 0;

        System.out.println(ANSI_BLUE + "\t\t\t\tCHOOSE A CLOSET BY NAME TO PACK: " + ANSI_RESET);
        userInput = new Scanner(System.in).nextLine();

        for (int i = 0; i < this.closetList.size(); i++) {
            if (this.closetList.get(i).getName().equalsIgnoreCase(userInput)) {
                closetIndexToPack = i;
                isInList = true;
            }
        }
        while (!isInList) {
            System.out.println("YOUR INPUT DOES NOT MATCH OUR RECORD. PLEASE TYPE AGAIN: ");
            userInput = new Scanner(System.in).nextLine();
            for (int i = 0; i < this.closetList.size(); i++) {
                if (this.closetList.get(i).getName().equalsIgnoreCase(userInput)) {
                    isInList = true;
                }
            }
        }

        if (isInList) {
            System.out.println("\t\t\t\tSELECT JACKET(S)");
            JacketSelect(closetIndexToPack);
            System.out.println("\t\t\t\tSELECT SHIRT(S)");
            ShirtSelect(closetIndexToPack);
            System.out.println("\t\t\t\tSELECT PANT(S)");
            PantsSelect(closetIndexToPack);
            System.out.println("\t\t\t\tSELECT SHOE(S)");
            ShoesSelect(closetIndexToPack);
        }
        System.out.println(ANSI_BLUE + "\t\t\t\tYour suit case has: " + ANSI_RESET);
        this.suitCase.forEach(System.out::println);
    }

    public void JacketSelect(int closetIndex) {
        boolean isOneJacketInList = false;
        isOneJacketInList = isJacketInSuitCase(closetIndex);
        while (!isOneJacketInList) {
            System.out.println("\t\t\t\tYou should pack 1 jacket to your suit case. Please pick one: ");
            isOneJacketInList = isJacketInSuitCase(closetIndex);
        }
    }

    private boolean isJacketInSuitCase(int closetIndex) {
        String userAnswer;
        boolean isOneJacketInList = false;
        for (int i = 0; i < this.closetList.get(closetIndex).getJacketList().size(); i++) {
            System.out.println("Do you want to add this "
                    + this.closetList.get(closetIndex).getJacketList().get(i)
                    + " to your suit case? Press yes to add or any key to refuse.");
            userAnswer = new Scanner(System.in).nextLine();
            if (userAnswer.equalsIgnoreCase("Yes")) {
                this.suitCase.add(this.closetList.get(closetIndex).getJacketList().get(i).toString());
                isOneJacketInList = true;
            }
        }
        return isOneJacketInList;
    }

    public void ShirtSelect(int closetIndex) {
        boolean isOneShirtInList = false;
        isOneShirtInList = isOneShirtInSuitCase(closetIndex);
        while (!isOneShirtInList) {
            System.out.println("\t\t\t\tYou should pack 1 shirt to your suit case. Please pick one: ");
            isOneShirtInList = isOneShirtInSuitCase(closetIndex);
        }
    }

    private boolean isOneShirtInSuitCase(int closetIndex) {
        String userAnswer;
        boolean isOneShirtInList = false;
        for (int i = 0; i < this.closetList.get(closetIndex).getShirtList().size(); i++) {
            System.out.println("Do you want to add this "
                    + this.closetList.get(closetIndex).getShirtList().get(i)
                    + " to your suit case? Press yes to add or any key to refuse.");
            userAnswer = new Scanner(System.in).nextLine();
            if (userAnswer.equalsIgnoreCase("Yes")) {
                this.suitCase.add(this.closetList.get(closetIndex).getShirtList().get(i).toString());
                isOneShirtInList = true;
            }
        }
        return isOneShirtInList;
    }

    public void PantsSelect(int closetIndex) {
        boolean isOnePantInList = false;
        isOnePantInList = isOnePantInSuitCase(closetIndex);
        while (!isOnePantInList) {
            System.out.println("\t\t\t\tYou should pack 1 pant to your suit case. Please pick one: ");
            isOnePantInList = isOnePantInSuitCase(closetIndex);
        }
    }

    private boolean isOnePantInSuitCase(int closetIndex) {
        String userAnswer;
        boolean isOnePantInList = false;
        for (int i = 0; i < this.closetList.get(closetIndex).getPantsList().size(); i++) {
            System.out.println("Do you want to add this "
                    + this.closetList.get(closetIndex).getPantsList().get(i)
                    + " to your suit case? Press yes to add or any key to refuse.");
            userAnswer = new Scanner(System.in).nextLine();
            if (userAnswer.equalsIgnoreCase("Yes")) {
                this.suitCase.add(this.closetList.get(closetIndex).getPantsList().get(i).toString());
                isOnePantInList = true;
            }
        }
        return isOnePantInList;
    }

    public void ShoesSelect(int closetIndex) {
        boolean isOneShoesInList = false;

        isOneShoesInList = isOneShoeInSuitCase(closetIndex);
        while (!isOneShoesInList) {
            System.out.println("\t\t\t\tYou should pack 1 pair of shoes to your suit case. Please pick one: ");
            isOneShoesInList = isOneShoeInSuitCase(closetIndex);

        }
    }

    private boolean isOneShoeInSuitCase(int closetIndex) {
        String userAnswer;
        boolean isOneShoeInList = false;
        for (int i = 0; i < this.closetList.get(closetIndex).getShoesList().size(); i++) {
            System.out.println("Do you want to add this "
                    + this.closetList.get(closetIndex).getShoesList().get(i)
                    + " to your suit case? Press yes to add or any key to refuse.");
            userAnswer = new Scanner(System.in).nextLine();
            if (userAnswer.equalsIgnoreCase("Yes")) {
                this.suitCase.add(this.closetList.get(closetIndex).getShoesList().get(i).toString());
                this.trackingShoes.add(this.closetList.get(closetIndex).getShoesList().get(i));
                isOneShoeInList = true;
                if (this.trackingShoes.size() == 1 &&
                        this.closetList.get(closetIndex).getShoesList().get(i).getKindOfShoes().equals("Flip Flop")) {
                    this.isFlipFlop = true;
                }
            }
        }
        while (this.isFlipFlop) {
            System.out.println("\t\t\t\tYou should pack OTHER PAIR(S) OF SHOES");
            for (int i = 0; i < this.closetList.get(closetIndex).getShoesList().size(); i++) {
                System.out.println("Do you want to add this "
                        + this.closetList.get(closetIndex).getShoesList().get(i)
                        + " to your suit case? Press yes to add or any key to refuse.");
                userAnswer = new Scanner(System.in).nextLine();
                if (userAnswer.equalsIgnoreCase("Yes")) {
                    this.suitCase.add(this.closetList.get(closetIndex).getShoesList().get(i).toString());
                    isOneShoeInList = true;
                    if (!this.closetList.get(closetIndex).getShoesList().get(i).getKindOfShoes().equals("Flip Flop")) {
                        this.isFlipFlop = false;
                    }
                }
            }
        }
        return isOneShoeInList;
    }


//    public void JacketSelect(int closetIndex) {
//        int countJacket = 0;
//        boolean isInList = true;
//        String userAnswer;
//
//        for (int i = 0; i < this.closetList.get(closetIndex).getJacketList().size(); i++) {
//            System.out.println("Do you want to add this in your suit case?");
//            userAnswer = new Scanner(System.in).nextLine();
//            if (userAnswer.equalsIgnoreCase("Yes")) {
//                this.suitCase.add(this.closetList.get(closetIndex).getJacketList().get(i).toString());
//            }
//        }
//    }
//
//    public void JacketSelect(int closetIndex) {
//        int countJacket = 0;
//        boolean isInList = true;
//        String userAnswer;
//
//        for (int i = 0; i < this.closetList.get(closetIndex).getJacketList().size(); i++) {
//            System.out.println("Do you want to add this in your suit case?");
//            userAnswer = new Scanner(System.in).nextLine();
//            if (userAnswer.equalsIgnoreCase("Yes")) {
//                this.suitCase.add(this.closetList.get(closetIndex).getJacketList().get(i).toString());
//            }
//        }
//    }

    //
//    private final int THREE = 3;
//    private String closetName;
//    private List<Jacket> jacketList = new ArrayList<>();
//    private List<Shirt> shirtList = new ArrayList<>();
//    private List<Pants> pantsList = new ArrayList<>();
//    private List<Shoes> shoesList = new ArrayList<>();
//    private List<Closet> closetsList = new ArrayList<>();
//
//    public Controller() {
//        this.jacketList.add(new Jacket("cotton", "blue"));
//        this.jacketList.add(new Jacket("linen", "Opal"));
//        this.jacketList.add(new Jacket("feather", "red"));
//        this.shirtList.add(new Shirt("linen", "black"));
//        this.shirtList.add(new Shirt("feather", "red"));
//        this.shirtList.add(new Shirt("cotton", "blue"));
//        this.pantsList.add(new Pants("feather", "red"));
//        this.pantsList.add(new Pants("linen", "black"));
//        this.pantsList.add(new Pants("cotton", "blue"));
//        this.shoesList.add(new Shoes("snicker", "feather", "green"));
//        this.shoesList.add(new Shoes("flip flop", "feather", "red"));
//        this.shoesList.add(new Shoes("sandal", "feather", "black"));
//    }
//
//    public void GenerateCloset() {
//        int randomNum = 0;
//        String closetName;
//
//        System.out.println("Input three closets name");
//        for (int i = 0; i < THREE; i++) {
//            randomNum = new Random().nextInt(THREE);
//            closetName = new Scanner(System.in).nextLine();
//
//            this.closetsList.add(new Closet(closetName, this.jacketList.get(randomNum), this.shirtList.get(randomNum), this.pantsList.get(randomNum), this.shoesList.get(randomNum)));
////            this.closetsList.add(closetName, this.jacketList.get(i), this.shirtList.get(i), this.pantsList.get(i), this.shoesList.get(i));
//        }
//
//        System.out.println("Here are three suggestion for you to pack: ");
//        for (int i = 0; i < this.closetsList.size(); i++) {
//            System.out.println(this.closetsList.get(i).toString());
//        }
//    }
//
//    public void SelectSuitCase() {
//        String userInput;
//        String userInput2;
//        int randomNum = 0;
//        System.out.println("Enter the closet you want to pack: ");
//        userInput = new Scanner(System.in).nextLine();
//        for (int i = 0; i < this.closetsList.size(); i++) {
//            if (this.closetsList.get(i).getName().equalsIgnoreCase(userInput)) {
//                if (this.closetsList.get(i).getShoes().getKindOfShoes().equalsIgnoreCase("flip flop")) {
//                    System.out.println("Do you want to add other kind of shoes?");
//                    userInput2 = new Scanner(System.in).nextLine();
//                    if (userInput2.equalsIgnoreCase("yes")) {
//                        randomNum = new Random().nextInt(THREE);
//                        while (this.shoesList.get(randomNum).getKindOfShoes().equalsIgnoreCase("flip flop")) {
//                            randomNum = new Random().nextInt(THREE);
//                        }
//                        this.closetsList.add(new Closet(this.closetsList.get(i).getName(), this.jacketList.get(randomNum), this.shirtList.get(randomNum), this.pantsList.get(randomNum), this.shoesList.get(randomNum)));
//                    }
//                    if (!userInput2.equalsIgnoreCase("yes")){
//                        System.out.println("Program End");
//                    }
//
//                }
//            }
//        }
//    }
//
//    public void DisplaySuitCaseByName() {
//        String userInput;
//        System.out.println("Enter the suitcase you want to look for: ");
//        userInput = new Scanner(System.in).nextLine();
//        for (int i = 0; i < this.closetsList.size(); i++) {
//            if (this.closetsList.get(i).getName().equalsIgnoreCase(userInput)) {
//                System.out.println(this.closetsList.get(i).toString());
//            }
//        }
//    }

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

