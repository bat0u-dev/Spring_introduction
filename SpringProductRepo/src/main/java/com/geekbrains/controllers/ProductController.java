package com.geekbrains.controllers;

import com.geekbrains.entities.Product;
import com.geekbrains.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "/showAll")
    public String showAllProducts(Model uiModel){
        List<Product> products = productService.getAllProducts();
        uiModel.addAttribute("products",products);
        return "product-all";
    }
}
