package ua.smartprog.lesson_13;

import static org.junit.Assert.*;

import org.junit.Test;

public class clTest {
    @Test
    public void testAdd() throws Exception {
        Calculator c1 = new Calculator();
        assertEquals(2, c1.add(1, 1));
    }
    @Test
    public void testSub()throws Exception{
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.sub(2,1));
    }
    @Test
    public void testMulti()throws Exception{
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multi(2,2));
    }
    @Test
    public void testDiv()throws Exception{
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(4,2));
    }
}
