package ua.smartprog.bankProject;
import java.util.Random;

public class Customer extends Human {
    Random random = new Random();
    private Account CustomerAccount = new Account();
    private int PhoneNumber;

    public Customer() {
        PhoneNumber = 0;
        this.CustomerAccount = new Account();
        CustomerAccount.setMoney(20);
        CustomerAccount.generateCardNumber();
        CustomerAccount.generateVCNumber();

    }

    public Customer(String fName, String sName, int cAge, int phoneNumber, int Money) {
        super(fName, sName, cAge);
        PhoneNumber = phoneNumber;
        this.CustomerAccount = new Account();
        CustomerAccount.setMoney(Money);
        CustomerAccount.generateCardNumber();
        CustomerAccount.generateVCNumber();
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setMoney(int ammount){
        CustomerAccount.setMoney(ammount);
    }

    public int getMoney(){
        return CustomerAccount.checkBalance();
    }
    public void CusTransaction(int i, Customer num2){
        setMoney(getMoney() - i);
        num2.setMoney(num2.getMoney() + i);
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }
}
