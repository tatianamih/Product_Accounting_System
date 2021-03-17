package jrr.by.mikhalchenko.model;

import java.math.BigDecimal;
import java.util.Objects;


public class Product {
    private Long id;

    private String name;

    private BigDecimal price;

    private FruitCategory сategory;

    private BigDecimal discount;

    private String description;

    public Product(String name, BigDecimal price, FruitCategory сategory, BigDecimal discount, String description) {
        this.name = name;
        this.price = price;
        this.сategory = сategory;
        this.discount = discount;
        this.description = description;
    }

    public Product(Long id, String name, BigDecimal price, FruitCategory сategory, BigDecimal discount, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.сategory = сategory;
        this.discount = discount;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public FruitCategory getСategory() {
        return сategory;
    }

    public void setСategory(FruitCategory сategory) {
        this.сategory = сategory;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                сategory == product.сategory &&
                Objects.equals(discount, product.discount) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, сategory, discount, description);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(
                "Id: " + id +
                        "\nName: " + name +
                        "\nPrice: " + price +
                        "\nCategory: " + сategory);
        if (discount != null) {
            stringBuilder.append("\nDiscount: ").append(discount.multiply(BigDecimal.valueOf(100)).setScale(0, BigDecimal.ROUND_HALF_UP)).append("%");
        }
        if (description != null) {
            stringBuilder.append("\nDescription: ").append(description);
        }
        return stringBuilder.toString();
    }

}


