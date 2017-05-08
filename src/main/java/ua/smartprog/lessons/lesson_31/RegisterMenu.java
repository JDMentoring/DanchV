package ua.smartprog.lessons.lesson_31;

import java.util.Scanner;

/**
 * Created by Admin on 02.04.2017.
 */
public class RegisterMenu {
    Register reg = null;

    public RegisterMenu(){
        this.reg = new Register();
        menu();
    }

    public void menu(){
        int choice = 0;
        System.out.println("[1] buy something; \n"
        + "[2] print sale");
        choice = scanInt();
        if(choice == 1){
            buy();
        }
        else if(choice == 2){
            reg.printSale();
        }
    }

    public void buy(){
        reg.addItemToSale(reg.getSale());
        menu();
    }

    public int scanInt(){
        Scanner scanint = new Scanner(System.in);
        return scanint.nextInt();
    }

    public String scanString(){
        Scanner scanString = new Scanner(System.in);
        return scanString.next();
    }
}
