package ua.smartprog.bankProject;
import java.util.Random;

public class customer extends human{
    Random random = new Random();
    private account CustomerAccount = new account();
    private int PhoneNumber;
    private Transaction CTransaction = new Transaction();

    public customer() {
        PhoneNumber = 0;
        this.CustomerAccount = new account();
        CustomerAccount.setMoney(20);
        CustomerAccount.setCardNumber(random.nextInt(10000) - 1);

    }

    public customer(String fName, String sName, int cAge, int phoneNumber, int Money) {
        super(fName, sName, cAge);
        PhoneNumber = phoneNumber;
        this.CustomerAccount = new account();
        CustomerAccount.setMoney(Money);
        CustomerAccount.setCardNumber(random.nextInt(10000) - 1);
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setMoney(int ammount){
        CustomerAccount.setMoney(ammount);
    }

    public int getMoney(){
        return CustomerAccount.getMoney();
    }
    public void CusTransaction(int i, customer num2){
        setMoney(getMoney() - i);
        num2.setMoney(num2.getMoney() + i);
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }
}
