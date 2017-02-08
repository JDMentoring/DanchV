package ua.smartprog.bankProject;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void ObjTest() throws Exception{
        ArrayList<Employee> staff = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                staff.add(new Employee());
            }else{
                staff.add(new Manager());
            }

            staff.get(i).setId();
        }

        for (Employee em: staff){
            System.out.println(em.toString());
        }

        Object obj = new Employee();


    }


}