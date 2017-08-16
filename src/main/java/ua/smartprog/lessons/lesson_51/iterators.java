package ua.smartprog.lessons.lesson_51;

import ua.smartprog.bankProject.domain.Account;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Тарас on 14.08.2017.
 */

public class iterators {
    public static void main(String[] args) {
        Collection<Account> accountCollection = new ArrayList<Account>();
        accountCollection.add(new Account());
        accountCollection.add(new Account());
        accountCollection.add(new Account());
        accountCollection.add(new Account());
        Iterator<Account> accountIterator = accountCollection.iterator();
        while (accountIterator.hasNext()) {
            Account tempAc = accountIterator.next();
            System.out.println(tempAc.toString());
        }
        for (Account accountIterator1 : accountCollection){
            System.out.println(accountIterator1.toString());
        }
        accountIterator.forEachRemaining(account -> System.out.println(accountIterator.toString()));
    }
}
