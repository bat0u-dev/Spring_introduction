package com.geekbrains.service;

import com.geekbrains.entities.Product;
import com.geekbrains.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getById(int id){
        try {
            return productRepository.findProductById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //возник вопрос, как в данном случае обрабатывать ситуацию с возвращемым значением в случае, если продукта с
        //указанным id нет в ProductList. Жду ответа от ментора.
        return new Product(1,"Продукт не был найден по id, и создан для возврата по умолчанию",1.00);
    }

    public List<Product> getAllProducts(){
        return productRepository.getProductList();
    }

    public void addProduct(int id, String title, double coast){
        productRepository.add(new Product(id,title,coast));
    }
}
