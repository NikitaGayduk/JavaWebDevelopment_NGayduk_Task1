package by.epam.javawebtraining.gayduknikita.task1.view.printer.PrintBehavior;

public class ConsolePrintBehavior extends AbstractPrintBehavior {
    @Override
    public void print(String data) {
        System.out.println(data);
    }
}
