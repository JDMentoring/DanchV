package ua.smartprog.bankProject;

public class Manager extends Employee{
    private int tax;
    private String bankName;

    public Manager() {
        super.defSet();
        tax = 300;
        bankName = "MyBank";
        setSalary(8000);
    }

    public Manager(String fName, String sName, int year, int month, int day, int ID, int Sal, String bankName) {
        super.setFirstName(fName);
        super.setSecondName(sName);
        super.setBD(year, month, day);
        tax = 300;
        this.bankName = bankName;
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
        return bankName;
    }

    public void createCustomerAccount(Customer cus) {
        Officer off1 = new Officer();
        off1.createCustomerAccount(cus);
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Manager(String bankName) {

        this.bankName = bankName;
    }

    public void setSalary(int salary) {

    }

    public String toString() {
        return super.toString() + ", Tax = " + tax
                + ", Bank Name = " + bankName
                + "]";
    }


    public Employee newEmployee() {
        return new Employee();
    }

    /*@Override
    public void deleteEmployee() {

    }*/
}
