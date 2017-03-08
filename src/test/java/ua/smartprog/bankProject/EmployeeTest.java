package ua.smartprog.bankProject;

import org.junit.Test;
import sun.dc.path.PathError;

import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

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

    @Test
    public void testINF() throws  Exception{

        ArrayList<Employee> staff = new ArrayList<Employee>();
        Customer cm = new Customer();
        Random rn = new Random(10000);

        for (int i = 0; i <10 ; i++) {
            staff.add(new Employee());
            staff.get(i).setSalary(rn.nextInt(10000));
        }

        Employee[] nextStaff = (Employee[]) staff.toArray();

        Arrays.sort(nextStaff);


        for (Employee em: staff){
            System.out.println(em.toString());
        }

        ToEmployee toem;

        Manager mn = new Manager();
        Officer of = new Officer();

        toem = mn;
       // toem = of;

        toem.newEmployee();

        Collection cl;
    }


}