package ua.smartprog.bankProject;

import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Menu {

    private String choiceNum;
    private Customer created;

    public Menu(){
        firstPage();
    }

    public void firstPage(){
        System.out.println("Are You a customer or an employee ?\n "
        + "[1] - Customer ;\n"
        + "[2] - Employee ;\n"
        + "[3] - Employ me! ;\n");
        choiceNum = scanPage();
        if(choiceNum == "1"){
            Customer created = new Customer();
            secondPage_customer();
        }
        else if(choiceNum == "2"){
            secondPage_employee();
        }
        else if(choiceNum == "3"){
            //chooseWork();
        }
        else {
            System.out.println("Choose 1 , 2 or 3");
            firstPage();
        }
    }

    public void secondPage_customer(){
        System.out.println("Choose option you want: \n"
        + "[1] - create account \n"
        + "[2] - enter account\n");
        choiceNum = scanPage();
        if(choiceNum == "1"){
            created.openAccount();
            create_customer();
        }
        else if(choiceNum == "2"){
            login_customer();
        }
        else {
            System.out.println("Choose 1 or 2!!");
            secondPage_customer();
        }
    }

    public void create_customer(){
        AccountsBase acc = new AccountsBase();
        Account newbie = new Account();
        acc.addAccount(newbie);
        secondPage_customer();
    }

    public void login_customer(){
        AccountsBase acc = new AccountsBase();
        Account needed;
        String checkCard;
        System.out.println("Login : \n"
        + "card number :");
        Scanner login = new Scanner(System.in);
        String cardNum = login.next();
        for (int i = 0; i < 20; i++){
            needed = (Account) acc.getAccs().get(i);
            checkCard = needed.getCardNumber();
            if(cardNum == checkCard){
                break;
            }
        }
        System.out.println("\npassword : ");
        if(needed.checkPassword()){
            //customerInterface();
            System.out.println("Go To Cus iface!!!");
        }
    }

    public void secondPage_employee(){
        System.out.println("What kind of Employee you are? :\n"
        + "[1] - Officer;\n"
        + "[2] - Consulter;\n"
        + "[3] - MANAGER\n");
        choiceNum = scanPage();
        if(choiceNum == "1"){
            officerMenu();
        }
        else if(choiceNum == "2"){
            //consulterMenu();
        }
        else if(choiceNum == "3"){
            //managerMenu();
        }
        else {
            System.out.println("Choose 1 , 2 or 3!!");
            secondPage_employee();
        }
    }

    public void officerMenu(){
        Officer myOffAccount = new Officer();
        System.out.println("Do you have to: \n"
        + "[1] - create account for a customer ;\n"
        + "[2] - checkout my workplace number;\n");
        choiceNum = scanPage();
        if(choiceNum == "1"){
            //myOffAccount.createCustomerAccount();
        }
        else if(choiceNum == "2"){
            System.out.println();
        }
    }

    public String scanPage(){
        Scanner scanPage = new Scanner(System.in);
        String scanPage1 = scanPage.next();
        return scanPage1;
    }

}
