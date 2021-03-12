package jrr.by.mikhalchenko.dao;

import jrr.by.mikhalchenko.model.FruitCategory;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDao <Product> {

    void addProduct(Product product);


    Product getProductById(Long id);


    List<Product> getListProducts();

    boolean removeProductById(Long id);

    List<Product> getListProductsByCategory(FruitCategory fruitCategory);

    List<FruitCategory> getListCategoryies();

    List<Product> hangeTheDiscountForAllProductsOfACertainCategory(FruitCategory fruitCategory, BigDecimal changedDiscount);

    void toChangeTheNameForTheProductById(long id, String name);

    void toChangeThePriceForTheProductById(long id, BigDecimal priceBigDecimal);

    void toChangeTheDiscountForTheProductById(long id, BigDecimal discountBigDecimal);

    void toChangeTheDescriptionForTheProductById(long id, String description);

    void changeTheDiscountForAllProductsOfACertainCategory(FruitCategory fruitCategory, BigDecimal changedDiscount);
}
