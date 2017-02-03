package ua.smartprog.bankProject;

public class Customer extends Human {
    private Account[] CustomerAccount;
    int account_num = 0;
    private int PhoneNumber;

    public Customer() {
        PhoneNumber = 0;
        this.CustomerAccount = new Account[account_num + 1];
        CustomerAccount[account_num].addMoney(20);
        CustomerAccount[account_num].generateCardNumber();
        CustomerAccount[account_num].generateVCNumber();
        this.CustomerAccount = new Account[1];
        Account defaultAccount = new Account();
        CustomerAccount[0] = defaultAccount;
        System.out.println("It's account number " + (account_num + 1));
    }

    public Customer(String fName, String sName, int cAge, int phoneNumber, int Money) {
        super(fName, sName, cAge);
        PhoneNumber = phoneNumber;
        this.CustomerAccount = new Account[account_num + 1];
        CustomerAccount[account_num].addMoney(Money);
        CustomerAccount[account_num].generateCardNumber();
        CustomerAccount[account_num].generateVCNumber();
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setMoney(int ammount, int numOfAcc){
        CustomerAccount[numOfAcc].addMoney(ammount);
    }

    public int getMoney(int numOfAcc){
        return CustomerAccount[numOfAcc].checkBalance();
    }
    public void CusTransaction(int ammount, Account num2){
        CustomerAccount[account_num].takeMoney(ammount);
        num2.addMoney(ammount);
    }
}
