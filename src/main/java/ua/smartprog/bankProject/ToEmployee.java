package ua.smartprog.bankProject;

public interface ToEmployee {
    public Employee newEmployee();
    default void deleteEmployee(){

    }
}
