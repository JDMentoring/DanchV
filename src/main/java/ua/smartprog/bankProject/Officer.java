import java.util.Random;
package ua.smartprog.bankProject;
public class Officer extends employee {
    private int WorkplaceNumber;
    Random random = new Random();

    public Officer() {
        WorkplaceNumber = random.nextInt(300) + 1;
        setSalary(2000);
    }

    public Officer(int workplaceNumber) {
        WorkplaceNumber = workplaceNumber;
        setSalary(2000);
    }

    public Officer(String fName, String sName, int cAge, int ID, int Sal, int workplaceNumber) {
        super(fName, sName, cAge, ID, Sal);
        WorkplaceNumber = workplaceNumber;
        setSalary(2000);
    }
}
