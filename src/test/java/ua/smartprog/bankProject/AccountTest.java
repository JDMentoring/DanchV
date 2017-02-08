/*package ua.smartprog.bankProject;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {
    @Test // Task 1502
    public void generateCardNumberTest() throws Exception {
        Account ac = new Account();
        assertEquals(16, ac.generateCardNumber().length());
    }
    @Test //TODO Task 1601
    public void generateDefaultPassTest(){
        Account ac = new Account();
        assertEquals(8, ac.getPassword().length());
        assertTrue(ac.getPassword().matches("(.*)_(.*)"));
    }
    @Test // TODO Task 1602
    public void setCustomerPassword(){
        Account ac = new Account();
        String customPass = "testpass";
        ac.setPassword(customPass);
        assertEquals(customPass, ac.getPassword());
    }
    @Test // TODO Task 1603
    public void generateVisaCardNumber() throws Exception{
        Account ac = new Account();
        ac.generateVCNumber();
        assertEquals(16, ac.generateVCNumber().length());
        assertEquals("4", String.valueOf(ac.getCardNumber().charAt(0)));
    }
}*/
