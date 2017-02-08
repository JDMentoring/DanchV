package ua.smartprog.lesson_19;

import ua.smartprog.bankProject.Account;
import java.util.ArrayList;

public class ArrayListLearning {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.ensureCapacity(1);
        accounts.trimToSize();
        for (int i = 0; i < 20; i++) {
            accounts.add(new Account());
        }

        accounts.set(15, new Account());
        accounts.get(10);
        Account acTemp =  accounts.remove(10);
        System.out.println(accounts.size());

    }
}
