import java.util.HashMap;
import java.util.Map;

public class Shop {
    private double billAmount = 0;
    Map<String, String> shoppingCart = new HashMap<>();

    Map<String, Double> listOfItems = new HashMap<>() {{
        put("Onion", 20.0);
        put("Tomato", 30.0);
        put("Apple", 200.0);
        put("Kiwi", 50.0);
        put("Salt", 10.0);
        put("Rice", 34.5);
    }};


    public void calculateBillAmount() {
        shoppingCart.forEach((name, quantity) -> {
            double quantityRequired = parseQuantity(quantity);
            double price = listOfItems.get(name);
            billAmount += price * quantityRequired;
        });
    }

    private double parseQuantity(String quantity) {
        String[] parts = quantity.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        double value = Double.parseDouble(parts[0]);
        String unit = parts[1];

        if ("kg".equals(unit)) {
            return value;
        }
        return value / 1000;
    }

    public String displayBill(){
        return "Total Cost: Rs " + billAmount;
    }
}