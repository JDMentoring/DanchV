package ua.smartprog.bankProject.domain;

import ua.smartprog.bankProject.domain.Employee;

public interface ToEmployee {
    public Employee newEmployee();
    default void deleteEmployee(){

    }
}
