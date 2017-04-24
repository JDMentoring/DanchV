package ua.smartprog.bankProject.other;

import java.util.Scanner;

public class SampleMenu {
    public static void run() {
        int choise = -1;
        do {
            printMenu();
            choise = getInput();
            doAction(choise);
        } while (choise != 0);
    }

    private static void printMenu() {
        System.out.println("===================");
        System.out.println("1 - Client List");
        System.out.println("2 - New Client");
        System.out.println("3 - Delete Client");
        System.out.println("4 - Search Client");
        System.out.println("===================");
        System.out.println("0 - Exit");
    }

    private static int getInput() {
        Scanner input = new Scanner(System.in);
        int temp = -1;
        do {
            System.out.print("Enter your choise :");
            temp = input.nextInt();
        } while (temp < 0 || temp > 4);
        return temp;
    }

    private static void doAction(int choise) {
        switch (choise) {
            case 0:
                System.out.println("thanks for work with our programm");
                break;
            case 1:
                System.out.println("Client List");
                break;
            case 2:
                System.out.println("New Client");
                break;
            case 3:
                System.out.println("Delete Client");
                break;
            case 4:
                System.out.println("Search client");
                break;
        }


    }
}
