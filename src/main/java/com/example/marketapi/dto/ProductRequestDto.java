package com.example.marketapi.dto;

import lombok.Data;

/**
 * Тело запроса товаров
 */

@Data
public class ProductRequestDto {

    /**
     * id товара
     */
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
