package ua.smartprog.lesson_29;

import ua.smartprog.bankProject.domain.Consulter;
import ua.smartprog.bankProject.domain.Employee;
import ua.smartprog.bankProject.domain.Manager;

import java.util.ArrayList;

public class TypeCorection {
    public static void main(String[] args) {
        double age = 17.4;
        int secondAge = (int) age;

        ArrayList<Employee> staff = new ArrayList<Employee>();
        ArrayList<Manager> managers = new ArrayList<Manager>();

        staff.add(new Employee());
        staff.add(new Manager());
        staff.add(new Consulter());
        staff.add(new Manager());

        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i) instanceof Manager) {
                managers.add((Manager) staff.get(i));
            }
        }

        Manager someBoss = (Manager) staff.get(2);

    }
}
