package com.example.marketapi.dto;

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
public class CategoryRequestDto {

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
