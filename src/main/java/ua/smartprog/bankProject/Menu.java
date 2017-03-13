package ua.smartprog.bankProject;

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
            //thirdPage_customer();
        }
        else if(choiceNum == "2"){
            secondPage_employee();
        }
        else {
            System.out.println("Choose 1 or 2!!");
            secondPage_customer();
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
