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

        productList=new ArrayList<Product>();
        productList.add(product1);

        return productList;
    }
}
