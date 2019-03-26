package by.epam.javawebtraining.gayduknikita.task1.view.printer;

import by.epam.javawebtraining.gayduknikita.task1.view.printer.PrintBehavior.AbstractPrintBehavior;
import by.epam.javawebtraining.gayduknikita.task1.view.printer.PrintBehavior.ConsolePrintBehavior;

/**
 * @author NikitaGayduk
 * @date 26.03.2019
 */
public class BasePrinter implements Printer {

    private AbstractPrintBehavior behavior;

    public BasePrinter() {
        this.behavior = new ConsolePrintBehavior();
    }

    public BasePrinter(AbstractPrintBehavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void print(String data) {
        behavior.print(data);
    }

    public void setBehavior(AbstractPrintBehavior behavior) {
        this.behavior = behavior;
    }
}
