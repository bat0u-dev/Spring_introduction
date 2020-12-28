package com.geekbrains.repository;

import com.geekbrains.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private final List<Product> productList = new ArrayList<Product>();

    public List<Product> getProductList() {
        return productList;
    }

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

    public Product findProductById(int id) throws Exception {
        for (Product product: this.getProductList()) {
            if(product.getId() == id){
                return product;
            }
        }
        //throw new Exception("продукт не найден по id");
        //возник вопрос, как в данном случае обрабатывать ситуацию с возвращемым значением в случае, если продукта с
        //указанным id нет в ProductList. Жду ответа от ментора.
        return new Product(1,"Продукт не был найден по id, и создан для возврата по умолчанию", 1.00);
    }

    public static void main(String[] args) {
        Product product1 = new Product(1,"Balalaika",1000000.00);
        ProductRepository repo1 = new ProductRepository();
        repo1.add(product1);
        repo1.printProductList();
    }
}

