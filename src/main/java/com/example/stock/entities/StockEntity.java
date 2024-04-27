package com.example.stock.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.HashMap;

@Entity
public class StockEntity {

    @JsonProperty("Time Series (Daily)")
    private HashMap<String, DailyData> timeSeriesDaily;
    // Getters and setters

    public void setTimeSeriesDaily(HashMap<String, DailyData> timeSeriesDaily) {
        this.timeSeriesDaily = timeSeriesDaily;
    }
    public HashMap<String, DailyData> getTimeSeriesDaily() {
        return timeSeriesDaily;
    }

}
