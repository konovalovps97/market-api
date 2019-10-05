package com.example.marketapi.service.impl;

import com.example.marketapi.model.Category;
import com.example.marketapi.model.Product;
import com.example.marketapi.repository.CategoryRepo;
import com.example.marketapi.repository.ProductRepo;
import com.example.marketapi.service.ServiceMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервис для управления магазина
 */
@Service
public class MarketService implements ServiceMethods {

    /**
     * Репа категорий
     */
    private final CategoryRepo categoryRepo;

    /**
     * Репа товаров
     */
    private final ProductRepo productRepo;

    @Autowired
    public MarketService(CategoryRepo categoryRepo, ProductRepo productRepo) {
        this.categoryRepo = categoryRepo;
        this.productRepo = productRepo;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public Category getCategory(String name) {
        return categoryRepo.findById(name).orElse(null);
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void addCategory(Category category) {

    }
}
