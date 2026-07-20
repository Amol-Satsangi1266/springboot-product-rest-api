package com.fernando.simpleWebApp.controller;

import com.fernando.simpleWebApp.model.Product;
import com.fernando.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts()
    {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getproductbyId(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        service.addProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);
    }
}
