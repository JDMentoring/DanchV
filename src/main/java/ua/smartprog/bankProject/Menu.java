package ua.smartprog.bankProject;

import java.util.Scanner;

/**
 * Created by Admin on 08.03.2017.
 */
public class Menu {
    public void firstPage(){
        System.out.println("Are You a customer or an employee ?\n "
        + "[1] - Customer ;\n"
        + "[2] - Employee ;\n");
        checkMenu1();
    }

    public void checkMenu1(){
        Scanner scan1Page = new Scanner(System.in);
        String scanPage1 = scan1Page.next();
        if(scanPage1 == "1"){
            secondPage_customer();
        }
        else if(scanPage1 == "2"){
            secondPage_employee();
        }
        else {
            System.out.println("Choose " + "1" +" or " + "2");
            checkMenu1();

        }
    }
    public void secondPage_customer(){
        Scanner scan2Page_customer = new Scanner(System.in);
        String scanPage2_customer = scan2Page_customer.next();
        System.out.println("Choose option you want: \n"
        + "[1] - create account \n"
        + "[2] - enter account\n"
        + "[3] - register in bank\n");
        if()
    }
}
