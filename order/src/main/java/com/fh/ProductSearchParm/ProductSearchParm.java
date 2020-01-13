package com.fh.ProductSearchParm;

import com.fh.model.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProductSearchParm extends Page {

    private String name;//
    private Date minPrice;//
    private Date maxPrice;//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Date minPrice) {
        this.minPrice = minPrice;
    }

    public Date getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Date maxPrice) {
        this.maxPrice = maxPrice;
    }
}


