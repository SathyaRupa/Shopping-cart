import java.util.HashMap;
import java.util.Map;

public class Shop {
    Map<String, String> shoppingCart = new HashMap<>();

    Map<String, Double> listOfItems = new HashMap<>() {{
        put("Onion", 20.0);
        put("Tomato", 30.0);
        put("Apple", 200.0);
        put("Kiwi", 50.0);
        put("Salt", 10.0);
        put("Rice", 34.5);
    }};

    BillingCounter billingCounter = new BillingCounter();

    public void calculateBillAmount() {
        billingCounter.calculateBillAmount(shoppingCart, listOfItems);
    }

    public String displayBill() {
        return billingCounter.displayBill();
    }
}