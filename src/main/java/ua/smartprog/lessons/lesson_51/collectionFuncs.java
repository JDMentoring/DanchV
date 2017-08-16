package ua.smartprog.lessons.lesson_51;

import ua.smartprog.bankProject.domain.Account;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Тарас on 16.08.2017.
 */
public class collectionFuncs {
    public static void main(String[] args) {
        Collection<Account> accCollection = new ArrayList<Account>();
        Collection<Account> accCollection1 = new ArrayList<Account>();
        accCollection.add(new Account());
        accCollection.add(new Account());
        accCollection.add(new Account());
        accCollection.add(new Account());
        accCollection.add(new Account());
        accCollection.add(new Account());
        accCollection.add(new Account());
        System.out.println(accCollection);
        accCollection.addAll(accCollection1);
        if(accCollection.equals(accCollection1)){
            System.out.println("Both collections are the same");
        }
        System.out.println(accCollection1);
        accCollection1.clear();
        if(accCollection1.isEmpty()) {
            System.out.println("accCollection1 is Empty now!!!");
        }
        for (Account tempAcc:accCollection) {
            if(tempAcc.getCardNumber() == "8484959678208152"){
                accCollection.remove(tempAcc);
                System.out.println("Removed!!!");
            }
        }
        Account[] accArray = new Account[7];
        accArray = accCollection.toArray(new Account[7]);
        if(accCollection.isEmpty() == false){
            accCollection.removeAll(accCollection1);
            System.out.println("Removed all same as in accCollection1!!");
        }
    }
}
