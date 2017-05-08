package ua.smartprog.lessons.lesson_31;

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

    public String getSale(){
        String total = new String();
           for(int i = 0; i < items.size(); i++){
               total = total + items.get(i).toString() + "\n";
           }
        return total;
    }
    public int getTotalPrice(){
        int total = 0;
        for(int i = 0; i < items.size(); i++){
            total = total + items.get(i).getSubTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Sale number : " + this.id + "\n"
                + getSale()
                + "Total Price" + getTotalPrice();
    }
}
