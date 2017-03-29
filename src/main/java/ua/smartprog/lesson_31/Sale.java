package ua.smartprog.lesson_31;

import java.util.ArrayList;

public class Sale {
    private int id;
    private static int nextId = 1;
    private ArrayList<SalesLineItem> items = null;

    public Sale(ArrayList<SalesLineItem> items) {
        setId();
        this.items = new ArrayList<SalesLineItem>(items);
    }

    public Sale() {
        setId();
        this.items = new ArrayList<SalesLineItem>();
    }

    public void addLineItem(Product product, int q) {
        this.items.add(new SalesLineItem(product, q));
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public int summaryPrice() {
        int summ = 0;

        for (SalesLineItem item : items) {
            summ += item.getSubTotal();
        }
        return summ;
    }

}
