package ua.smartprog.bankProject;

public class Customer extends Human {
    private Account[] CustomerAccount;
    private int PhoneNumber;

    public Customer() {
        PhoneNumber = 0;
        this.CustomerAccount = new Account();
        CustomerAccount.setMoney(20);
        CustomerAccount.generateCardNumber();
        CustomerAccount.generateVCNumber();
        this.CustomerAccount = new Account[1];
        Account defaultAccount = new Account();
        CustomerAccount[0] = defaultAccount;
    }

    //start refactoring

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
