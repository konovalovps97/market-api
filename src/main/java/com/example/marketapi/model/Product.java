package com.example.marketapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность товара
 */
@Entity
@Table(name = "categories")
@Data
public class Product {

    /**
     * id товара
     */
    @Id
    private Long id;

    /**
     * Наименование товара
     */
    private String name;

    /**
     * Описание товара
     */
    private String description;

    /**
     * Количество товаров
     */
    private String quantity;

}
