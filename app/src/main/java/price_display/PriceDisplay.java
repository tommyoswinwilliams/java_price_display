package price_display;

public class PriceDisplay{
  public static void main(String[] args) {
    String item = "Coffee Machine";
    Double price = 15.99;
    System.out.printf("The price of the %s is £%.2f", item, price);
  }

  public String getPriceLabel(String item, Double price) {
    String priceLabel = String.format("The price of the %s is £%.2f", item, price);
    return priceLabel;
  }
}