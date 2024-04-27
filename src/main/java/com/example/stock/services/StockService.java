package com.example.stock.services;

import com.example.stock.entities.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

    private final String API_BASE_URL = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY";
    private final String interval= "5min";
    private final String apiKey= "UIWY03BP9ONB8MCT";
    private final RestTemplate restTemplate;

    @Autowired
    public StockService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public StockEntity fetchStockData(String symbol) {
        String apiUrl = API_BASE_URL + "&symbol=" + symbol + "&interval=" + interval + "apiKey=" + apiKey;  // Example API endpoint
        return restTemplate.getForObject(apiUrl, StockEntity.class);
    }
}
