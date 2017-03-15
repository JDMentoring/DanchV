package ua.smartprog.lesson_31;

public class SalesLineItem {
    private Product item;
    private int quantity;

    public SalesLineItem(Product item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }
    public Product getItem(){
        return item;
    }
}
