package com.fernando.simpleWebApp.service;

import com.fernando.simpleWebApp.model.Product;
import com.fernando.simpleWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Canon",100000)));

    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod)
    {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
