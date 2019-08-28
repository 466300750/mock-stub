import java.util.List;

public class StubPurchase extends Purchase {

    private String purchaseContent;

    public StubPurchase(List<String> items) {
        super(items);
    }

    @Override
    public String asString() {
        return this.purchaseContent;
    }

    public void setPurchaseContent(String purchaseContent) {
        this.purchaseContent = purchaseContent;
    }
}
