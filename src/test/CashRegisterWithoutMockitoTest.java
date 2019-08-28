import org.junit.Test;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertTrue;

public class CashRegisterWithoutMockitoTest {

    @Test
    public void shouldPrintEmptyPurchase() {

        Printer printer = new MockPrinter();
        CashRegister cashRegister = new CashRegister(printer);

        cashRegister.process(new Purchase(emptyList()));

        assertTrue(printer.isPrinted());
    }
}