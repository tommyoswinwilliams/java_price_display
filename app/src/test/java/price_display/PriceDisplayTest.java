package price_display;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PriceDisplayTest {
  @Test public void testGetPriceLabel() {
    PriceDisplay pd = new PriceDisplay();
    assertEquals("Prints item and price", "The price of the Coffee Machine is £15.99", pd.getPriceLabel("Coffee Machine", 15.99));
  }
}
