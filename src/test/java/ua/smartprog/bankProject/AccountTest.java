package ua.smartprog.bankProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
    @Test // Task 1502
    public void generateCardNumberTest() throws Exception {
        Account ac = new Account();
        //TODO Реалізувати метод із сигнатурою наведеною нижче
        assertEquals(16, ac.generateCardNumber().length());
    }
}
