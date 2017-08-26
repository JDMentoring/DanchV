package ua.smartprog.lessons.lesson_53;

import ua.smartprog.bankProject.domain.Account;

import java.util.*;

/**
 * Created by rebell9191 on 26.08.2017.
 */
public class CollectionsTest {
    public static void main(String[] args) {
        Set<Account> accountHashset = new LinkedHashSet<Account>();
        Account temp = new Account();
        accountHashset.add(temp);
        temp = new Account();
        accountHashset.add(temp);
        temp = new Account();
        accountHashset.add(temp);
        System.out.println(accountHashset.hashCode());
        System.out.println("size : " + accountHashset.size());
        accountHashset.remove(temp);
        for (int i = 0; i < 100; i++){
            temp = new Account();
            accountHashset.add(temp);
        }
        Object[] accArray = accountHashset.toArray();
        Map<Integer, Object> accountLinkedHashmap = new LinkedHashMap<Integer, Object>();
        for(int i = 0; i < accArray.length; i ++) {
            accountLinkedHashmap.put(i, accArray[i]);
        }
        System.out.println("size of linkedHashMap) : " + accountLinkedHashmap.size());
        accountLinkedHashmap.remove(3);
        accountLinkedHashmap.remove(8);
        System.out.println("size of linkedHashMap) : " + accountLinkedHashmap.size());
        for (Object bufferObj: accountLinkedHashmap.entrySet()) {
            int temporary = 0;
            accArray[temporary] = bufferObj;
            temporary++;
        }
        accountLinkedHashmap.clear();
        Map<Integer, Object> weakHashMap = new WeakHashMap<Integer , Object>();
        if(accountLinkedHashmap.isEmpty() == true){
            for (int i = 0; i < accArray.length; i++){
                weakHashMap.put(i, accArray[i]);
            }
        }
        Account temp2 = new Account();
        if(weakHashMap.containsValue(temp2)){
            weakHashMap.remove(temp2);
        }
        else {
            weakHashMap.put(1020, temp2);
        }
        System.out.println(weakHashMap.toString());
        weakHashMap.clear();
    }
}
