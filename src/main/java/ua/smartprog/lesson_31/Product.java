package ua.smartprog.lesson_31;

public class Product {
    private int id;
    private int price;

    public Product() {
        this.id = 0;
        this.price = 0;
    }

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
