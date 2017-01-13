public class consulter extends employee{
    private int experience;

    public consulter() {
        experience  = 4;
        setSalary(1000);

    }

    public consulter(int experience) {
        this.experience = experience;
        setSalary(1000);
    }

    public consulter(String fName, String sName, int cAge, int ID, int Sal) {
        super(fName, sName, cAge, ID, Sal);
        this.experience = 4;
        setSalary(1000);
    }
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
