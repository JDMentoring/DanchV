package ua.smartprog.lesson_31;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesLineItem {
    private Product item;
    private int quantity;
    private ArrayList<Product> prods = new ArrayList<Product>();

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

    public Product chooseProduct() {
        for (Product item : prods) {
            System.out.println("id: " + item.getId() + " - " + item.getDescription());
        }
        System.out.print("select product by id: ");
        Scanner prod = new Scanner(System.in);
        int prodSelect = prod.nextInt();

        for (int i = 0; i < prods.size(); i++) {
            if (item.getId() == prodSelect) {
                prodSelect = i;
                break;
            }
        }

        this.item = prods.get(prodSelect);
        return prods.get(prodSelect);
    }

    public void addNewProduct() {
        Scanner prod = new Scanner(System.in);
        System.out.println("Type the product name and price:");
        Product item = new Product(prod.next(), prod.nextInt());
        prods.add(item);
    }

    public int getSubTotal() {
        return item.getPrice() * quantity;
    }

}
