import homework8.Product;
import homework8.ProductBuilder;
import homework8.ProductManager;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.addProduct(
                new ProductBuilder()
                        .setType("Book")
                        .setPrice(300.0)
                        .setDiscountable(false)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Book")
                        .setPrice(15.0)
                        .setDiscountable(false)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Book")
                        .setPrice(75.0)
                        .setDiscountable(false)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Book")
                        .setPrice(74.0)
                        .setDiscountable(false)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Furniture")
                        .setPrice(150.0)
                        .setDiscountable(true)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Furniture")
                        .setPrice(99.99)
                        .setDiscountable(true)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Furniture")
                        .setPrice(25.0)
                        .setDiscountable(true)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Toy")
                        .setPrice(13.0)
                        .setDiscountable(true)
                        .setCreatedOn(LocalDateTime.now())
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Electronics")
                        .setPrice(400.0)
                        .setDiscountable(false)
                        .setCreatedOn(LocalDateTime.of(2024, Month.APRIL, 14, 12, 30, 15))
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Book")
                        .setPrice(260.0)
                        .setDiscountable(true)
                        .setCreatedOn(LocalDateTime.of(2024, Month.JANUARY, 1, 10, 10, 30))
                        .createProduct()
        );
        manager.addProduct(
                new ProductBuilder()
                        .setType("Book")
                        .setPrice(1.0)
                        .setDiscountable(true)
                        .setCreatedOn(LocalDateTime.of(2023, Month.FEBRUARY, 24, 12, 33, 05))
                        .createProduct()
        );

        List<Product> filteredByPriceBooks = manager.getProductsByTypeWithPriceGT(
                "Book",
                250.0
        );
        System.out.println("Books with the price higher than 250:");
        for (Product book : filteredByPriceBooks) {
            System.out.println("Type: " + book.getType() + ", Price: " + book.getPrice() + " EUR");
        }

        List<Product> discountedBooks = manager.getDiscountedProductsWithType("Book");
        System.out.println("Get books with discount:");
        for (Product book : discountedBooks) {
            System.out.println("Type: " + book.getType() + ", Price: " + book.getPrice() + "EUR ");
        }

        try {
            Product cheapestBook = manager.getCheapestProduct("Cat");
            System.out.println("Cheapest book price: " + cheapestBook.getPrice());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            Product cheapestBook = manager.getCheapestProduct("Book");
            System.out.println("Cheapest book price: " + cheapestBook.getPrice());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        List<Product> latestProducts = manager.getThreeLatestProducts();
        for (Product latestBook : latestProducts) {
            System.out.println(latestBook.getCreatedOn());
        }

        System.out.println(manager.getThisYearProductsTotalPriceWithPriceLowerThanSpecified(75.0));
        var sortedProducts = manager.groupProductsByType();
        System.out.println(sortedProducts.toString());
    }
}
