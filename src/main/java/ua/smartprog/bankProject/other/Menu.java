package ua.smartprog.bankProject.other;

import ua.smartprog.bankProject.domain.Employee;

import java.util.Scanner;

public class Menu {

    private int choiceNum;

    public Menu() {
        firstPage();
    }

    public void firstPage() {
        System.out.println("Are You a customer or an employee ?\n "
                + "[1] - Customer ;\n"
                + "[2] - Employee ;\n"
                + "[3] - Employ me!;\n");
        choiceNum = scanPage();
        if (choiceNum == 1) {
            System.out.println("Calling second page");
            secondPage_customer();
        } else if (choiceNum == 2) {
            Login();
        } else if (choiceNum == 3) {
            employ();
        } else {
            System.out.println("Choose 1 , 2 or 3");
            firstPage();
        }
    }

    public void employ() {
        System.out.println("Put your credentials: \n"
                + "first name: ");
        String fname = scanText();
        System.out.println("\nsecond name: ");
        String sname = scanText();
        System.out.println("\nDate of birth:\n"
                + "year: ");
        Scanner date = new Scanner(System.in);
        int year = Integer.parseInt(date.next());
        System.out.println("\nmonth: ");
        int month = Integer.parseInt(date.next());
        System.out.println("\nday: ");
        int day = Integer.parseInt(date.next());
        Base.addPotentialEmployee(fname, sname, year, month, day);
    }

    public void secondPage_customer() {
        System.out.println("Choose option you want: \n"
                + "[1] - enter account\n"
                + "[2] - register me!\n");
        choiceNum = scanPage();
        if (choiceNum == 1) {
            login_customer();
        } else if (choiceNum == 2) {

        } else {
            System.out.println("Choose 1 or 2!!");
            secondPage_customer();
        }
    }

    public void login_customer() {
        int index = 0;
        String checkCard;
        System.out.println("Login : \n"
                + "card number :");
        Scanner login = new Scanner(System.in);
        String cardNum = login.next();
        for (int i = 0; i < 20; i++) {
            checkCard = Base.getAccountsBase(i).getCardNumber();
            if (cardNum == checkCard) {
                index = i;
                break;
            }
        }
        System.out.println("\npassword : ");
        if (Base.getAccountsBase(index).checkPassword()) {
            customerInterface(index);
            System.out.println("Go To Cus iface!!!");
        }
    }

    public void customerInterface(int index) {
        System.out.println("Customer menu: \n"
                + "[1] - add money;\n"
                + "[2] - take money;\n"
                + "[3] - check balance;\n"
                + "[4] - reset password;\n"
                + "[5] - check card date;\n"
                + "[6] - info;\n");
        choiceNum = scanPage();
        if (choiceNum == 1) {
            System.out.println("How much money do you want to add: ");
            int amount = scanPage();
            Base.getAccountsBase(index).addMoney(amount);
        } else if (choiceNum == 2) {
            System.out.println("How much money do you want to add: ");
            int amount = scanPage();
            Base.getAccountsBase(index).takeMoney(amount);
        } else if (choiceNum == 3) {
            System.out.println(" Your current balance is : " + Base.getAccountsBase(index).checkBalance() + " UAH");
        } else if (choiceNum == 4) {
            String password = scanText();
            Base.getAccountsBase(index).resetPassword(password);
        } else if (choiceNum == 5) {
            Base.getAccountsBase(index).checkCardDate();
        } else if (choiceNum == 6) {
            Base.getAccountsBase(index).toString();
        } else {
            System.out.println("Choose one of the options!!!");
            customerInterface(index);
        }
    }

    public void Login() {
        System.out.println("Type your id:");
        int id = scanPage();
        int index = 0;
        for (Employee emp : Base.getEmployeeBase()) {
            if (id == emp.getId()) {
                officerInterface(index);
                break;
            } else {
                index++;
            }
        }
        officerInterface(index);
    }

    public void officerInterface(int index) {
        System.out.println("Do you have to: \n"
                + "[1] - create account for a customer ;\n"
                + "[2] - checkout my workplace number;\n");
        choiceNum = scanPage();
        if (choiceNum == 1) {
            System.out.println("index of customer:");
            int idx = scanPage();
            Base.getOfficerBase(index).createCustomerAccount(idx);
        } else if (choiceNum == 2) {
            System.out.println();
        }
    }

    public void consulterInterface(int index) {
        System.out.println("Type the customers data: \n"
                + "first name: ");
        String fname = scanText();
        System.out.println("\nsecond name: ");
        String sname = scanText();
        System.out.println("\nDate of birth:\n"
                + "year: ");
        int year = scanPage();
        System.out.println("\nmonth: ");
        int month = scanPage();
        System.out.println("\nday: ");
        int day = scanPage();
        System.out.println("\nphone number: ");
        String phoneNumber = scanText();
        System.out.println("\nbalance: ");
        int money = scanPage();
        System.out.println("\npassword: ");
        String pass = scanText();
        Base.getConsulterBase(index).registerCustomer(fname, sname, year, month, day, phoneNumber, money, pass);
    }

    public void managerInterface(int index) {
        int idx;
        System.out.println("Choose action: \n"
                + "[1] - set salary; \n"
                + "[2] - new employee; \n"
                + "[3] - fire employee; \n"
                + "[4] - get tax; \n"
                + "[5] - info));\n");
        choiceNum = scanPage();
        if (choiceNum == 1) {
            System.out.println("employees index:");
            idx = scanPage();
            System.out.println("new salary :");
            int salary = scanPage();
            Base.getManagerBase(index).setSalary(salary, idx);
        } else if (choiceNum == 2) {
            System.out.println("Put index of potential employee:");
            idx = scanPage();
            Base.getManagerBase(index).newEmployee(Base.getPotentialEmployees(idx));
        } else if (choiceNum == 3) {
            System.out.println("employees index:");
            idx = scanPage();
            Base.getManagerBase(index).deleteEmployee(idx);
        } else if (choiceNum == 4) {
            System.out.println("The current tax is " + Base.getManagerBase(index).getTax() + " UAH;");
        } else if (choiceNum == 5) {
            Base.getManagerBase(index).ToString();
        } else {
            System.out.println("Choose option!");
            managerInterface(index);
        }
    }

    public int scanPage() {
        Scanner scanPage = new Scanner(System.in);
        return scanPage.nextInt();
    }

    public String scanText() {
        Scanner scanText = new Scanner(System.in);
        return scanText.next();
    }

}