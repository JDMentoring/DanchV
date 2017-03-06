package ua.smartprog.bankProject;

public class Employee extends Human {
    private static int nextId = 1;

    private int id;
    private int salary;
    private int workDays;


    public Employee() {
        super();
        id = 0;
        salary = 0;
        workDays = 0;
    }
//start ToString
    /**
     *
     * @param fName - імя
     * @param sName - прізвище
     * @param ID - айді
     * @param Sal - зарплата
     */
    public Employee(String fName, String sName, int year, int month, int day, int ID, int Sal) {
        super(fName, sName, year, month, day);
        this.id = ID;
        salary = Sal;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public static int getNextId() {
        return nextId;
    }

    public String toString() {
        return "Employee[firstName = " + this.getFirstName()
                + ", secondName = " + this.getSecondName()
                + ", age = " + this.getAge()
                + ", id = " + id
                + ", salary = " + salary
                + ", workDays = " + workDays
                + "]";
    }

    public boolean equals(Object otherObject){
        if(this == otherObject) return true;

        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        return  false;
    }

}
