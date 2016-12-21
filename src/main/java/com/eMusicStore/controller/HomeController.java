package com.eMusicStore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eMusicStore.dao.ProductDao;
import com.eMusicStore.model.Product;

@Controller
public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Product> products = productDao.getProductList();
        model.addAttribute("products", products);

        return "productList";
    }
}
