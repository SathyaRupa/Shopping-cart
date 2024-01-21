import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    @Test
    void shouldDisplayTheCorrectBillAmountForTheProducts() {
        Shop shop = new Shop();

        shop.shoppingCart.put("Onion", "500mg");
        shop.shoppingCart.put("Rice", "3kg");
        shop.shoppingCart.put("Apple", "1kg");

        shop.calculateBillAmount();
        String actualBill = shop.displayBill();
        String expectedBill = "Total Cost: Rs " + 313.5;

        assertEquals(expectedBill, actualBill);
    }

    @Test
    void shouldDisplay0WhenShoppingCartIsEmpty() {
        Shop shop = new Shop();

        shop.calculateBillAmount();
        String actualBill = shop.displayBill();
        String expectedBill = "Total Cost: Rs " + 0.0;

        assertEquals(expectedBill, actualBill);
    }
}