package ua.smartprog.bankProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void checkAge() throws Exception{
        Customer cus1 = new Customer("danylo", "wasylyshyn", 2002, 8, 1, "0990227478", 99999, "qwerty");
        assertEquals(14, cus1.getAge(), 0);
    }
}