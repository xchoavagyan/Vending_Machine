package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        boolean displayMenu = true;
        while (displayMenu){
            System.out.println("----------------MENU---------------");
            System.out.println("-----1------------2-----------3----");
            System.out.println("A" + "--Cola--------Fanta--------Pepsi--");
            System.out.println("B" + "--Kitkat-----Snickers------Twix---");
            System.out.println("C" + "--Lays-------Pringles-----Doritos-");
            System.out.println("-----------------------------------");
            System.out.println("------Enter your product code------");
            String input = scanner.nextLine();
            System.out.println((vendingMachine.giveProduct(Converter.convertInputToCommand(input))).getName());
            if (vendingMachine.quantityOfProduct(Converter.convertInputToCommand(input)).equals("0")){
                    System.out.println("Please choose other Product");
            }
        }
    }
}
