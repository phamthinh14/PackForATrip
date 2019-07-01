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
        System.out.println(ANSI_BLUE + "\t\t\t\tYOUR SUIT CASE HAS: " + ANSI_RESET);
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
        int flipFlopIndex;
        int i = 0;
        for (; i < this.closetList.get(closetIndex).getShoesList().size(); i++) {
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

        for (int j = 0; j < this.trackingShoes.size(); j++) {
            this.closetList.get(closetIndex).getShoesList().remove(this.trackingShoes.get(j));
        }

        while (this.isFlipFlop) {
            System.out.println("\t\t\t\tYou should pack OTHER PAIR(S) OF SHOES");
            for (int j = 0; j < this.closetList.get(closetIndex).getShoesList().size(); j++) {
                System.out.println("Do you want to add this "
                        + this.closetList.get(closetIndex).getShoesList().get(j)
                        + " to your suit case? Press yes to add or any key to refuse.");
                userAnswer = new Scanner(System.in).nextLine();
                if (userAnswer.equalsIgnoreCase("Yes")) {
                    this.suitCase.add(this.closetList.get(closetIndex).getShoesList().get(j).toString());
                    isOneShoeInList = true;
                    if (!this.closetList.get(closetIndex).getShoesList().get(j).getKindOfShoes().equals("Flip Flop")) {
                        this.isFlipFlop = false;
                    }
                }
            }
        }
        return isOneShoeInList;
    }


}

