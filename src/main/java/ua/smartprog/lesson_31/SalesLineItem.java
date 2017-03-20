package ua.smartprog.lesson_31;

public class SalesLineItem {
    private Product item;
    private int quantity;


    public SalesLineItem() {
        this.item = null;
        this.quantity = 0;
    }

    public SalesLineItem(Product item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getItem() {
        return item;
    }

    public int getSubTotal() {
        return item.getPrice() * quantity;
    }

}
