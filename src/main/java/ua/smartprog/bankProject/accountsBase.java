package ua.smartprog.bankProject;

import java.util.ArrayList;

/**
 * Created by Admin on 15.03.2017.
 */
public class AccountsBase {
    private ArrayList<Account> accountsBase = new ArrayList<Account>();

    public  void addMenuAccount(){
        Account newAcc = new Account();
        accountsBase.add(newAcc);
    }

    public ArrayList getAccs(){
        return accountsBase;
    }

    public void addAccount(Account newbie){
        accountsBase.add(newbie);
    }
}
