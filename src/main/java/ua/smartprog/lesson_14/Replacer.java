package ua.smartprog.lesson_14;

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

    public static void main(String[] args) {
        IRead reader = new DocsReader("145451221212442");
        IOut console = new ConsoleOut();
        IOut printer = new PrinterOut();
        Replacer consoleReplacer = new Replacer(reader, console);
        Replacer printerReplacer = new Replacer(reader, printer);
        consoleReplacer.replace();
        printerReplacer.replace();
    }
}
