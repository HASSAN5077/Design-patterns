package Delegation;

public class Main {
    public static void main(String[] args) {
        HpPrinter hp = new HpPrinter();
        EpsonPrinter epson = new EpsonPrinter();
        CannonPrinter cannon = new CannonPrinter();
        Printer printer = new Printer(epson);
        printer.print();
    }
}
