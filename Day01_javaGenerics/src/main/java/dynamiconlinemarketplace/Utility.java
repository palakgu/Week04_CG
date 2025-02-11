package dynamiconlinemarketplace;

public class Utility {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        // Calculate the discount price
        double discountPrice = product.getPrice() - (product.price * (percentage / 100));

        // Set the new discounted price for the product
        product.setPrice(discountPrice);
    }
}