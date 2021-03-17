package jrr.by.mikhalchenko.util;

import jrr.by.mikhalchenko.model.FruitCategory;
import jrr.by.mikhalchenko.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestProductDatabase {
    public static List<Product> createTestProductDatabase() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(0L, "Yellow lemon", BigDecimal.valueOf(3.5), FruitCategory.LEMON, BigDecimal.valueOf(0.1), "Fresh apple from Poland"));
        products.add(new Product(1L, "Grapes", BigDecimal.valueOf(5.20), FruitCategory.GRAPES, BigDecimal.valueOf(0.20), "Fresh apple from Russia"));
        products.add(new Product(2L, "Red apple", BigDecimal.valueOf(3.96), FruitCategory.APPLE, BigDecimal.valueOf(0.10), "Fresh apple from Ukraine"));
        products.add(new Product(3L, "Green apple", BigDecimal.valueOf(3.16), FruitCategory.APPLE, BigDecimal.valueOf(0.05), "Fresh apple from Belarus"));
        products.add(new Product(4L, "Banana", BigDecimal.valueOf(2.34), FruitCategory.BANANA, BigDecimal.valueOf(0.6), "Fresh apple from Brazil"));
        return products;
    }
}

