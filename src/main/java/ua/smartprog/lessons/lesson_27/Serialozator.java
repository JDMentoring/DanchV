package ua.smartprog.lessons.lesson_27;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Serialozator {
    private static ArrayList<Human> people = new ArrayList<Human>();

    public static void main(String[] args) {

        people = (ArrayList<Human>) getData("people");

        System.out.println("In start : people size = " + people.size());
        Human hm = new Human();

        hm.setFirstName(JOptionPane.showInputDialog(null, "Введіть імя"));
        hm.setSecondName(JOptionPane.showInputDialog(null, "Введіть прізвище"));
        hm.setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Введіть прізвище")));

        people.add(hm);

        for (Human item : people) {
            System.out.println(item.toString());
        }

        System.out.println("In end : people size = " + people.size());
        saveData("people", people);
    }

    public static void saveData(String fileName, Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName + ".ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(obj);
            fileOut.close();
            objOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error with object");
            System.exit(2);
        }
    }


    public static Object getData(String fileName) {
        Object retnObject = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName + ".ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            retnObject = objIn.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error with object");
            System.exit(2);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            System.exit(3);
        }
        return retnObject;
    }
}
