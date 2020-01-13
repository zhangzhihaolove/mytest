package com.fh.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class OrderQuery extends DataTablePageBean {

    private String orderName;

    private BigDecimal minPrice;

    private BigDecimal maxPrice;

    private Long minSales;

    private Long maxSales;

    private Long minStock;

    private Long maxStock;

    private Integer areaId;

    private Integer brandId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minExpireDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxExpireDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minProducedDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxProducedDate;

    private String person;

    private Integer isOtc;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Long getMinSales() {
        return minSales;
    }

    public void setMinSales(Long minSales) {
        this.minSales = minSales;
    }

    public Long getMaxSales() {
        return maxSales;
    }

    public void setMaxSales(Long maxSales) {
        this.maxSales = maxSales;
    }

    public Long getMinStock() {
        return minStock;
    }

    public void setMinStock(Long minStock) {
        this.minStock = minStock;
    }

    public Long getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Long maxStock) {
        this.maxStock = maxStock;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Date getMinExpireDate() {
        return minExpireDate;
    }

    public void setMinExpireDate(Date minExpireDate) {
        this.minExpireDate = minExpireDate;
    }

    public Date getMaxExpireDate() {
        return maxExpireDate;
    }

    public void setMaxExpireDate(Date maxExpireDate) {
        this.maxExpireDate = maxExpireDate;
    }

    public Date getMinProducedDate() {
        return minProducedDate;
    }

    public void setMinProducedDate(Date minProducedDate) {
        this.minProducedDate = minProducedDate;
    }

    public Date getMaxProducedDate() {
        return maxProducedDate;
    }

    public void setMaxProducedDate(Date maxProducedDate) {
        this.maxProducedDate = maxProducedDate;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Integer getIsOtc() {
        return isOtc;
    }

    public void setIsOtc(Integer isOtc) {
        this.isOtc = isOtc;
    }
}
