package com.example.marketapi.service;

import com.example.marketapi.model.Category;
import com.example.marketapi.model.Product;

import java.util.List;

/**
 * Интерфейс, содержащий методы для работы сервиса обработки и создания товара
 */
public interface ServiceMethods {

    /**
     * Метод, возвращащий список категорий
     *
     * @return список категорий
     */
    public List<Category> getAllCategories();

    /**
     * Метод, возвращающий список категорий
     *
     * @param name наименование категории
     * @return категорию
     */
    public Category getCategory(String name);

    /**
     * Метод, возвращающий список категорий
     *
     * @return список категорий
     */
    public List<Product> getProducts();

    /**
     * @param id id товара
     * @return товар
     */
    public Product getProduct(Long id);

    /**
     * @param product товар
     */
    public void addProduct(Product product);

    /**
     * @param category категория
     */
    public void addCategory(Category category);

}
