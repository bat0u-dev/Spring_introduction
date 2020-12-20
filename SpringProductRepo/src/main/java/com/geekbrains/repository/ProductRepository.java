package com.geekbrains.repository;

import com.geekbrains.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> productList = new ArrayList<Product>();

    public void add(Product product){
        productList.add(product);
    }

    public void clear(){
        productList.clear();
    }

    public void printProductList(){
        for (Product product: productList) {
            System.out.println(product.info());
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(1,"Balalaika",1000000.00);
        ProductRepository repo1 = new ProductRepository();
        repo1.add(product1);
        repo1.printProductList();
    }
}

