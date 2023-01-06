package Delegation;

public class EpsonPrinter implements Task{
    @Override
    public void print() {
        System.out.println("Epson is printing....");

    }
}
