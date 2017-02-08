package ua.smartprog.bankProject;

public class Manager extends Employee {
    private int Tax;
    private String BankName;

    public Manager() {
        Tax = 300;
        BankName = "MyBank";
        setSalary(8000);
    }

    public Manager(String fName, String sName, int cAge, int ID, int Sal, String bankName) {
        super(fName, sName, cAge, ID, Sal);
        BankName = bankName;
        setSalary(8000);
    }

    public void increaseSal(int i, Officer a) {
        a.setSalary(a.getSalary() + i);
    }

    public void increaseSal(int i, Consulter a) {
        a.setSalary(a.getSalary() + i);
    }

    public void decreaseSal(int i, Officer a) {
        a.setSalary(a.getSalary() - i);
    }

    public void decreaseSal(int i, Consulter a) {
        a.setSalary(a.getSalary() - i);
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public Manager(String bankName) {

        BankName = bankName;
    }

    public void setSalary(int salary) {

    }

}
