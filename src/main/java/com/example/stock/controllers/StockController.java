package com.example.stock.controllers;


import com.example.stock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stock/{symbol}")
    public String getStockData(@PathVariable String symbol) {
        return stockService.fetchStockData(symbol).toString();
    }
}
