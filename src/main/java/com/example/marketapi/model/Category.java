package com.example.marketapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность категорий
 */
@Entity
@Table(name = "categories")
@Data
public class Category {

    /**
     * Наименование категории
     */
    @Id
    private String name;

    /**
     * Описание категории
     */
    private String description;

    /**
     * id категории
     */
    private Long categoryId;

}
