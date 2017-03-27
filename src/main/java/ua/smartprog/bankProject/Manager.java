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


    public void increaseSal(int i, int index) {
        Base.getEmployee(index).setSalary(Base.getEmployee(index).getSalary() + i);
    }

    public void decreaseSal(int i, int index) {
        Base.getEmployee(index).setSalary(Base.getEmployee(index).getSalary() - i);
    }


    public String getBankName() {
        return bankName;
    }


    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Manager(String bankName) {

        this.bankName = bankName;
    }

    public int getTax() {
        return tax;
    }

    public void setSalary(int salary, int index) {
        Base empBase = new Base();
        Employee temp = (Employee) empBase.getEmployeeBase().get(index);
        temp.setSalary(salary);
    }

    public String toString() {
        return super.toString() + ", Tax = " + tax
                + ", Bank Name = " + bankName
                + "]";
    }


    public void newEmployee(Employee emp) {
        Base empBase = new Base();
        empBase.employ(emp);
    }

    public void deleteEmployee(int index) {
        Base empBase = new Base();
        empBase.fireEmployee(index);
    }
}
