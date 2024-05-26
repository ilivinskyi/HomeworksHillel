package homework8;

import java.time.LocalDateTime;

public class Product {

    private String type;
    private Double price;
    private boolean discountable;
    private LocalDateTime createdOn;
    private Integer id;

    public Product(String type, Double price, boolean discountable, LocalDateTime createdOn) {
        this.type = type;
        this.price = price;
        this.discountable = discountable;
        this.createdOn = createdOn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getDiscountable() {
        return discountable;
    }

    public void setDiscountable(boolean discountable) {
        this.discountable = discountable;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return (
                "Product{" +
                        "type='" +
                        type +
                        '\'' +
                        ", price=" +
                        price +
                        ", discountable=" +
                        discountable +
                        ", createdOn=" +
                        createdOn +
                        ", id=" +
                        id +
                        '}'
        );
    }
}
