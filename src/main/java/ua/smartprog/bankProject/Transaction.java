package ua.smartprog.bankProject;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Transaction {
    private static int prevNum = 1;
    int transactionNumber = 0;
    GregorianCalendar transactionDate = null;
    String cardFrom = null;
    String cardTo = null;
    int amount = 0;
    static boolean success;

    public static Transaction create(String cardFrom, String cardTo, int amount) {

            if (checkAccounts(cardFrom, cardTo) && checkAmount(amount)) {
                success = true;
            } else {
                try{
                    throw new FalseArgumentsException("One or several arguments are incorrect!!!");
                }
                catch (FalseArgumentsException e){
                    e.printStackTrace();
                    success = false;
                }
            }
        return new Transaction(cardFrom, cardTo, amount);
    }

    public static boolean checkAccounts(String cardFrom, String cardTo) {
        if (cardFrom.length() == 16 && cardTo.length() == 16) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkAmount(int ammount) {
        if (ammount > 0) {
            return true;
        } else {
            try {
                throw new LessThanZeroException("The amount is less than zero");
            } catch (LessThanZeroException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public Transaction() {
        setTransactionNumber();
        cardFrom = "";
        cardTo = "";
        amount = 0;
        success = false;
    }

    private Transaction(String cardFrom, String cardTo, int amount) {
        setTransactionNumber();
        transactionDate = new GregorianCalendar();
        this.cardFrom = cardFrom;
        this.cardTo = cardTo;
        this.amount = amount;
    }

    public void setTransactionNumber() {
        transactionNumber = prevNum;
        prevNum++;
    }



    @Override
    public String toString() {
        return "Transaction{" +
                "transactionNumber=" + transactionNumber +
                ", transactionDate=" + transactionDate.get(Calendar.DATE) + "." +
                transactionDate.get(Calendar.MONTH) + "."  +
                transactionDate.get(Calendar.YEAR) + " " +
                transactionDate.get(Calendar.HOUR) + ":" +
                transactionDate.get(Calendar.MINUTE) + ":" +
                transactionDate.get(Calendar.SECOND) + "," +
                ", cardFrom='" + cardFrom + '\'' +
                ", cardTo='" + cardTo + '\'' +
                ", amount=" + amount +
                '}';
    }
}
