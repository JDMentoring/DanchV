package ua.smartprog.bankProject;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Menu {

    private String choiceNum;
    private Customer created;

    public Menu() {
        firstPage();
    }

    public void firstPage() {
        System.out.println("Are You a customer or an employee ?\n "
                + "[1] - Customer ;\n"
                + "[2] - Employee ;\n"
                + "[3] - Employ me!;\n");
        choiceNum = scanPage();
        if (choiceNum == "1") {
            System.out.println("Calling second page");
            secondPage_customer();
        } else if (choiceNum == "2") {
            secondPage_employee();
        } else if (choiceNum == "3") {
            employ();
        } else {
            System.out.println("Choose 1 , 2 or 3");
            firstPage();
        }
    }

    public void employ() {
        Base potBase = new Base();
        System.out.println("Put your credentials: \n"
                + "first name: ");
        String fname = scanPage();
        System.out.println("\nsecond name: ");
        String sname = scanPage();
        System.out.println("\nDate of birth:\n"
                + "year: ");
        Scanner date = new Scanner(System.in);
        int year = Integer.parseInt(date.next());
        System.out.println("\nmonth: ");
        int month = Integer.parseInt(date.next());
        System.out.println("\nday: ");
        int day = Integer.parseInt(date.next());
        Employee emp = new Employee(fname, sname, year, month, day);
        potBase.addPotentialEmployee(emp);
    }

    public void secondPage_customer() {
        System.out.println("Choose option you want: \n"
                + "[1] - create account \n"
                + "[2] - enter account\n");
        choiceNum = scanPage();
        if (choiceNum == "1") {
            created.openAccount();
            create_customer();
        } else if (choiceNum == "2") {
            login_customer();
        } else {
            System.out.println("Choose 1 or 2!!");
            secondPage_customer();
        }
    }

    public void create_customer() {
        Base acc = new Base();
        Account newbie = new Account();
        acc.addAccount(newbie);
        secondPage_customer();
    }

    public void login_customer() {
        Base acc = new Base();
        Account needed = null;
        String checkCard;
        System.out.println("Login : \n"
                + "card number :");
        Scanner login = new Scanner(System.in);
        String cardNum = login.next();
        for (int i = 0; i < 20; i++) {
            needed = (Account) acc.getAccs().get(i);
            checkCard = needed.getCardNumber();
            if (cardNum == checkCard) {
                break;
            }
        }
        System.out.println("\npassword : ");
        if (needed.checkPassword()) {
            customerInterface(needed);
            System.out.println("Go To Cus iface!!!");
        }
    }

    public void customerInterface(Account acc) {
        System.out.println("Customer menu: \n"
                + "[1] - add money;\n"
                + "[2] - take money;\n"
                + "[3] - check balance;\n"
                + "[4] - reset password;\n"
                + "[5] - check card date;\n"
                + "[6] - info;\n");
        choiceNum = scanPage();
        if (choiceNum == "1") {
            System.out.println("How much money do you want to add: ");
            Scanner money = new Scanner(System.in);
            int amount = Integer.parseInt(money.next());
            acc.addMoney(amount);
        } else if (choiceNum == "2") {
            System.out.println("How much money do you want to add: ");
            Scanner money = new Scanner(System.in);
            int amount = Integer.parseInt(money.next());
            acc.takeMoney(amount);
        } else if (choiceNum == "3") {
            System.out.println(" Your current balance is : " + acc.checkBalance() + " UAH");
        } else if (choiceNum == "4") {
            String password = scanPage();
            acc.resetPassword(password);
        } else if (choiceNum == "5") {
            acc.checkCardDate();
        } else if (choiceNum == "6") {
            acc.toString();
        } else {
            System.out.println("Choose one of the options!!!");
            customerInterface(acc);
        }
    }

    public void secondPage_employee() {
        System.out.println("What kind of Employee you are? :\n"
                + "[1] - Officer;\n"
                + "[2] - Consulter;\n"
                + "[3] - MANAGER\n");
        choiceNum = scanPage();
        if (choiceNum == "1") {
            officerInterface();
        } else if (choiceNum == "2") {
            consulterInterface();
        } else if (choiceNum == "3") {
            managerInterdace();
        } else {
            System.out.println("Choose 1 , 2 or 3!!");
            secondPage_employee();
        }
    }

    public void officerInterface() {
        Officer myOffAccount = new Officer();
        System.out.println("Do you have to: \n"
                + "[1] - create account for a customer ;\n"
                + "[2] - checkout my workplace number;\n");
        choiceNum = scanPage();
        if (choiceNum == "1") {
            Customer cus = new Customer();
            myOffAccount.createCustomerAccount(cus);
        } else if (choiceNum == "2") {
            System.out.println();
        }
    }

    public void consulterInterface() {
        Consulter myConAccount = new Consulter();
        System.out.println("Type the customers data: \n"
                + "first name: ");
        String fname = scanPage();
        System.out.println("\nsecond name: ");
        String sname = scanPage();
        System.out.println("\nDate of birth:\n"
                + "year: ");
        Scanner date = new Scanner(System.in);
        int year = Integer.parseInt(date.next());
        System.out.println("\nmonth: ");
        int month = Integer.parseInt(date.next());
        System.out.println("\nday: ");
        int day = Integer.parseInt(date.next());
        System.out.println("\nphone number: ");
        String phoneNumber = scanPage();
        System.out.println("\nbalance: ");
        int money = Integer.parseInt(date.next());
        System.out.println("\npassword: ");
        String pass = scanPage();
        myConAccount.registerCustomer(fname, sname, year, month, day, phoneNumber, money, pass);
    }

    public void managerInterdace() {
        Manager managAcc = new Manager();
        System.out.println("Choose action: \n"
                + "[1] - set salary; \n"
                + "[2] - new employee; \n"
                + "[3] - fire employee; \n"
                + "[4] - get tax; \n"
                + "[5] - info));\n");
        choiceNum = scanPage();
        if (choiceNum == "1") {
            System.out.println("employees index:");
            Scanner emp = new Scanner(System.in);
            int index = Integer.parseInt(emp.next());
            System.out.println("new salary :");
            int salary = Integer.parseInt(emp.next());
            managAcc.setSalary(salary, index);
        }
        else if (choiceNum == "2") {
            Base potBase = new Base();
            System.out.println("Put index of potential employee:");
            Scanner emp = new Scanner(System.in);
            int index = Integer.parseInt(emp.next());
            managAcc.newEmployee(potBase.getPotentialEmployees().get(index));
        }
        else if (choiceNum == "3") {
            System.out.println("employees index:");
            Scanner emp = new Scanner(System.in);
            int index = Integer.parseInt(emp.next());
            managAcc.deleteEmployee(index);
        }
        else if (choiceNum == "4") {
            System.out.println("The current tax is " + managAcc.getTax() + " UAH;");
        }
        else if (choiceNum == "5") {
            managAcc.ToString();
        }
        else {
            System.out.println("Choose option!");
            managerInterdace();
        }
    }

    public String scanPage() {
        Scanner scanPage = new Scanner(System.in);
        String scanPage1 = scanPage.next();
        System.out.println(scanPage1);
        return scanPage1;
    }

}