package com.mobileboy.elementsandcostdivision.ui.introduction.mpd;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 7/9/17.
 */

public class MPDItemEntity {

    private String description;
    private int quantity;
    private String dimension;
    private int unitPrice;
    private int totalPrice;

    public MPDItemEntity(String description, int quantity, String dimension, int unitPrice, int totalPrice) {
        this.description = description;
        this.quantity = quantity;
        this.dimension = dimension;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
