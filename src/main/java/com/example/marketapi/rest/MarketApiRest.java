package com.example.marketapi.rest;

import com.example.marketapi.model.Category;
import com.example.marketapi.model.Product;
import com.example.marketapi.service.impl.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController(value = "/api/market/")
public class MarketApiRest {

    /**
     * Сервис, в котором осущесвтялется основная работа
     */
    private final MarketService marketService;

    @Autowired
    public MarketApiRest(MarketService marketService) {
        this.marketService = marketService;
    }

    @GetMapping
    private ResponseEntity<List<Category>> getAll() {
        return new ResponseEntity<>(marketService.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping(value = "{categoryName}")
    private ResponseEntity<Category> get(@NotNull @RequestParam String categoryName) {
        return new ResponseEntity<>(marketService.getCategory(categoryName), HttpStatus.OK);
    }
}
