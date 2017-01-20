package ua.smartprog.lesson_14;

public class ReplaceRunner {
    public static void main(String[] args) {
        IRead reader = new DocsReader("145451221212442");
        IOut console = new ConsoleOut();
        IOut printer = new PrinterOut();

        callReplacer(reader, console);
        callReplacer(reader, printer);

        /*Replacer consoleReplacer = new Replacer(reader, console);
        Replacer printerReplacer = new Replacer(reader, printer);
        consoleReplacer.replace();
        printerReplacer.replace();*/
    }

    public static void callReplacer(IRead r, IOut o){
        Replacer replacer = new Replacer(r, o);
        replacer.replace();
    }
}
