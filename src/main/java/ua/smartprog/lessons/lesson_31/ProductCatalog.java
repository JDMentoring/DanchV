package ua.smartprog.lessons.lesson_31;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductCatalog {
    private ArrayList<Product> prods = null;

    public ProductCatalog(ArrayList<Product> prods) {
        prods = new ArrayList<Product>(prods);
    }

    public ProductCatalog(){
        prods = new ArrayList<Product>();
    }

    public ArrayList<Product> getProds() {
        return prods;
    }

    public void setProds(String descr, int price) {
        prods.add(new Product(descr, price));
    }

    public Product chooseProduct() {
        for (Product item : prods) {
            System.out.println("id: " + item.getId() + " - " + item.getDescription());
        }
        System.out.print("select product by id: ");
        Scanner prod = new Scanner(System.in);
        int prodSelect = prod.nextInt();

        for (int i = 0; i < prods.size(); i++) {
            if (prods.get(i).getId() == prodSelect) {
                prodSelect = i;
                break;
            }
        }

        return prods.get(prodSelect);
    }
}
