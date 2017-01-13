import com.sun.org.apache.xpath.internal.SourceTree;

public class runner {
    public static void main(String[] args) {
        Manager manag = new Manager();
        Officer office  = new Officer();
        consulter con = new consulter();
        customer cus1 = new customer();
        customer cus2 = new customer();
        customer cus3 = new customer();
        cus1.setMoney(1700);
        cus2.setMoney(2000);
        cus3.setMoney(20000);
        cus3.CusTransaction(2000, cus2);
        System.out.println(cus2.getMoney());
        System.out.println(cus3.getMoney());
        manag.increaseSal(200, con);
        manag.decreaseSal(300, office);
        System.out.println(office.getSalary());
        System.out.println(con.getSalary());
    }
}
