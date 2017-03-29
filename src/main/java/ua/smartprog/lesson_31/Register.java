package ua.smartprog.lesson_31;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    private ArrayList<Sale> sales = null;
    private ProductCatalog calatog = null;

    public Register(ArrayList<Sale> sales, ProductCatalog productCatalog) {
        sales = new ArrayList<Sale>(sales);
        calatog = productCatalog;
    }

    public Register() {
        sales = new ArrayList<Sale>();
        calatog = new ProductCatalog();
    }

    public Sale newSale() {
        Sale temp = new Sale();
        sales.add(temp);
        return temp;
    }

    public void addItemToSale(Sale sale) {
        Scanner input = new Scanner(System.in);
        int tempQuantity = 0;
        Product tempPr = calatog.chooseProduct();
        System.out.println("How much?");
        System.out.print(tempPr.toString() + " : ");
        tempQuantity = input.nextInt();
        sale.addLineItem(tempPr, tempQuantity);
    }
}


/*SalesLineItem item1 = new SalesLineItem(new Product(1, 1000), 10);
        SalesLineItem item2 = new SalesLineItem(new Product(2, 2000), 15);
        SalesLineItem item3 = new SalesLineItem(new Product(3, 3000), 20);
        prod.addProd(item1);
        prod.addProd(item2);
        prod.addProd(item3);

        System.out.println("Summary price = " + prod.summaryPrice());*/