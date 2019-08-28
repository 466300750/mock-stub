import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CashRegisterWithMockitoTest {

    @Mock
    private Printer mockPrinter;

    @Mock
    private Purchase stubPurchase;

    @Test
    public void shouldPrintEmptyPurchase() {

        CashRegister cashRegister = new CashRegister(mockPrinter);

        cashRegister.process(new Purchase(emptyList()));

        verify(mockPrinter).print(anyString());
    }

    @Test
    public void processShouldPrintTheStubPurchase() {

        String printThis = "Print This";
        when(stubPurchase.asString()).thenReturn(printThis);
        CashRegister cashRegister = new CashRegister(mockPrinter);

        cashRegister.process(stubPurchase);

        verify(mockPrinter).print(printThis);
    }
}