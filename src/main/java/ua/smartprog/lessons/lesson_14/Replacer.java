package ua.smartprog.lessons.lesson_14;

public class Replacer {
    private IRead reader;
    private IOut  printer;

    public Replacer(IRead reader, IOut printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replace(){
    String text = reader.read();
    String repText = text.replace("1","9");
    printer.print(repText);
    }
}
