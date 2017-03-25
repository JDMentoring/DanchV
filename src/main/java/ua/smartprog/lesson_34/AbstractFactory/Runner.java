package ua.smartprog.lesson_34.AbstractFactory;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.next();
        DeveloperFactory devFac = create(type);
        Developer dev = devFac.getDeveloper();
        dev.writeCode();
    }

    static DeveloperFactory create(String devType) {
        if (devType.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (devType.equalsIgnoreCase("C#")) {
            return new CDeveloperFactory();
        } else {
            throw new RuntimeException(devType + "not defined.");
        }
    }
}
