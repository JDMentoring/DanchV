package ua.smartprog.lesson_31;

public class Product {
    private int id;
    private static int nextId = 1;
    private String description;
    private int price;

    public Product() {
        this.id = 0;
        this.price = 0;
        this.description = "null";
    }

    public Product(String description, int price) {
        setId();
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", description = " + description +
                ", price = " + price;
    }
}
