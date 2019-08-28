public class MockPrinter extends Printer {

    @Override
    public void print(String printString) {
        super.setPrinted(true);
    }
}
