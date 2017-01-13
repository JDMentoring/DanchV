public class account {
    private int money;
    private int CardNumber;
    private String Password;

    public void setPassword(String password) {
        this.Password = password;
    }

    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public int getMoney() {
        return money;
    }
}
