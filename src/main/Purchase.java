import java.util.List;

public class Purchase {
    private List<String> items;

    public Purchase(List<String> items) {
        this.items = items;
    }

    public String asString() {
        return String.join(",", items);
    }
}
