package homework8;

import java.time.LocalDateTime;

public class ProductBuilder {

    private String type;
    private Double price;
    private boolean discountable;
    private LocalDateTime createdOn;

    public ProductBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ProductBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setDiscountable(boolean discountable) {
        this.discountable = discountable;
        return this;
    }

    public ProductBuilder setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public Product createProduct() {
        return new Product(type, price, discountable, createdOn);
    }
}
