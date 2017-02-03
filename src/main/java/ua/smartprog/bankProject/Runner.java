package ua.smartprog.bankProject;

public class Runner {
    public static void main(String[] args) {
        Manager manag = new Manager();
        Officer office  = new Officer();
        Consulter con = new Consulter();
        Account firs = new Account();
        firs.generateDefaultPassword();
        System.out.println(office.getSalary());
        System.out.println(con.getSalary());
    }
}
