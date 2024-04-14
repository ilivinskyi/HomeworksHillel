package homework8;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class ProductManager {

    private int lastProductNumber = 0;
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        product.setId(++lastProductNumber);
        products.add(product);
    }

    public List<Product> getProductsByTypeWithPriceHigherThan(String type, Double price) {
        return products
                .stream()
                .filter(product -> product.getType().equals(type) && product.getPrice() > price)
                .toList();
    }

    public List<Product> getDiscountedProductsWithType(String type) {
        return products
                .stream()
                .filter(product -> product.getType().equals(type) && product.getDiscountable())
                .map(product -> {
                    double discountedPrice = product.getPrice() * 0.9;
                    product.setPrice(discountedPrice);
                    return product;
                })
                .toList();
    }

    public Product getCheapestProduct(String type) throws NoSuchElementException {
        Optional<Product> cheapestBook = products
                .stream()
                .filter(product -> product.getType().equals(type))
                .min(Comparator.comparingDouble(Product::getPrice));
        if (cheapestBook.isEmpty()) {
            throw new NoSuchElementException("Продукт [категорія: " + type + "] не знайдено");
        }
        return cheapestBook.get();
    }

    public List<Product> getThreeLatestProducts() {
        return products
                .stream()
                .sorted(Comparator.comparing(Product::getCreatedOn).reversed())
                .limit(3)
                .toList();
    }

    public Double getThisYearProductsTotalPriceWithPriceLowerThanSpecified(Double maxPrice) {
        return products
                .stream()
                .filter(product ->
                        product
                                .getCreatedOn()
                                .isAfter(LocalDateTime.of(2024, Month.from(Month.JANUARY), 1, 0, 0, 0)) &&
                                product.getPrice() < maxPrice
                )
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<String, List<Product>> groupProductsByType() {
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }
}
