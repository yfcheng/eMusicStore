package com.eMusicStore.dao;

import java.util.ArrayList;
import java.util.List;

import com.eMusicStore.model.Product;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();

        product1.setProductName("Guitar1");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a fender strat guitar!");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender");

        Product product2 = new Product();

        product2.setProductName("Record1");
        product2.setProductCategory("Instrument");
        product2.setProductDescription("This is a new guitar!");
        product2.setProductPrice(1200);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(11);
        product2.setProductManufacturer("Fender");

        Product product3 = new Product();

        product3.setProductName("Violin");
        product3.setProductCategory("Instrument");
        product3.setProductDescription("This is a new Violin!");
        product3.setProductPrice(1200);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(11);
        product3.setProductManufacturer("Fender");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }
}
