package ua.smartprog.lesson_14;

public class PrinterOut implements IOut{
    public void print(String line){
        System.out.println("Sending to printer...");
    }
}
