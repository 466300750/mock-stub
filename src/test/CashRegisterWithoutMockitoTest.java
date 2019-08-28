import org.junit.Test;

import java.util.ArrayList;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CashRegisterWithoutMockitoTest {

    @Test
    public void shouldPrintEmptyPurchase() {

        Printer printer = new MockPrinter();
        CashRegister cashRegister = new CashRegister(printer);

        cashRegister.process(new Purchase(emptyList()));

        assertTrue(printer.isPrinted());
    }

    @Test
    public void processShouldPrintTheStubPurchase() {

        MockPrinter printer = new MockPrinter();
        StubPurchase purchase = new StubPurchase(new ArrayList<>());
        String printThis = "Print This";
        purchase.setPurchaseContent(printThis);
        CashRegister cashRegister = new CashRegister(printer);

        cashRegister.process(purchase);

        assertEquals(printThis, printer.getPrintContent());
    }
}