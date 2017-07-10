package com.mobileboy.elementsandcostdivision.ui.introduction.mpd;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 7/9/17.
 */

public class MPDHeaderEntity {

    private String description;
    private int quantity;
    private String dimension;
    private String unitPrice;
    private String totalPrice;

    public MPDHeaderEntity(String description, int quantity, String dimension, String unitPrice, String totalPrice) {
        this.description = description;
        this.quantity = quantity;
        this.dimension = dimension;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public MPDHeaderEntity() {
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

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
