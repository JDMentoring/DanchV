package ua.smartprog.lessons.lesson_53;

import ua.smartprog.bankProject.domain.Account;

import java.nio.channels.AcceptPendingException;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSetTest {
    public static void main(String[] args) {
        /*
        червоно-чорні дерева
         */
        SortedSet<Account> someCollection = new TreeSet<Account>();
        Account temp = new Account();
        System.out.println(temp.getCardNumber());
        someCollection.add(temp);
        temp = new Account();
        System.out.println(temp.getCardNumber());
        someCollection.add(temp);
        temp = new Account();
        System.out.println(temp.getCardNumber());
        someCollection.add(temp);
        System.out.println("\n");
        for (Account name : someCollection) {
            System.out.println(name.getCardNumber());
        }
    }
}
