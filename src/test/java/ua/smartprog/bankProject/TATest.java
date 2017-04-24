package ua.smartprog.bankProject;

import org.junit.Test;
import ua.smartprog.bankProject.domain.Transaction;

import static org.junit.Assert.*;


public class TATest {
    @Test
    public void SetTransactionNumberTest() throws Exception{
        Transaction tr1 = new Transaction();
        Transaction tr2 = new Transaction();
        assertEquals(tr1.transactionNumber, tr2.transactionNumber - 1);
    }

    @Test
    public void checkAccountsTest() throws Exception{
        Transaction tr = new Transaction();
        assertEquals(tr.checkAccounts("123123123", "11231232"), false);
    }

    @Test
    public void checkAmmountTest() throws Exception{
        Transaction tr = new Transaction();
        tr.checkAmount(1);
    }

    @Test
    public void createTest()throws Exception{
        Transaction tr = new Transaction();
        tr.create("0000000000000000", "1111111111111111", 10);
        Transaction tr2 = new Transaction();
        tr.create("0000000000000000", "1111111111111111", 10);
        assertEquals(tr.cardFrom, tr2.cardFrom);
        assertEquals(tr.cardTo, tr2.cardTo);
        assertEquals(tr.amount, tr2.amount);
    }
}
