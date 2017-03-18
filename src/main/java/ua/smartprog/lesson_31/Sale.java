package ua.smartprog.lesson_31;

import java.util.ArrayList;

public class Sale {
    private ArrayList<SalesLineItem> items = new ArrayList<SalesLineItem>();

    public void addProd(SalesLineItem item) {
        items.add(item);
    }

    public int summaryPrice() {
        int summ = 0;

        for (SalesLineItem item : items) {
            summ += item.getSubTotal();

        }
        return summ;
    }

}
