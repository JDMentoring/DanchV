package ua.smartprog.lesson_31;

public class saleRunner {
    public static void main(String args[]) {
        Sale prod = new Sale();
        /*SalesLineItem item1 = new SalesLineItem(new Product(1, 1000), 10);
        SalesLineItem item2 = new SalesLineItem(new Product(2, 2000), 15);
        SalesLineItem item3 = new SalesLineItem(new Product(3, 3000), 20);
        prod.addProd(item1);
        prod.addProd(item2);
        prod.addProd(item3);

        System.out.println("Summary price = " + prod.summaryPrice());*/

        SalesLineItem sli = new SalesLineItem();

        sli.addNewProduct();
        sli.addNewProduct();
        sli.addNewProduct();

        System.out.println(sli.chooseProduct().toString());


    }
}
