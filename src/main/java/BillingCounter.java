
import java.util.Map;

public class BillingCounter {

    private double billAmount = 0;

    public void calculateBillAmount(Map<String, String> shoppingCart, Map<String, Double> listOfItems) {
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
