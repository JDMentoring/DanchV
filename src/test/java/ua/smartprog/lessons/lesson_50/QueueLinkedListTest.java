package ua.smartprog.lessons.lesson_50;

import org.junit.Test;
import ua.smartprog.bankProject.domain.Account;

import static org.junit.Assert.*;

public class QueueLinkedListTest {
    @Test
    public void add() throws Exception {
        QueueLinkedList<Account> accountQueue = new QueueLinkedList<Account>();
        accountQueue.add(new Account());
        accountQueue.add(new Account());
        accountQueue.add(new Account());
        while (accountQueue.isEmpty()) {
            System.out.println(accountQueue.get().toString());
        }
    }

}