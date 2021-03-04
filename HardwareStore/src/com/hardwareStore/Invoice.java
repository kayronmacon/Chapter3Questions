package com.hardwareStore;

public class Invoice {
    private String part_number = "";
    private String part_description= "";
    private int items = 0;
    private double price_item = 0.0;

    public String getPart_number() {
        return part_number;
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public String getPart_description() {
        return part_description;
    }

    public void setPart_description(String part_description) {
        this.part_description = part_description;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public double getPrice_item() {
        return price_item;
    }

    public void setPrice_item(double price_item) {
        this.price_item = price_item;
    }
    public double getInvoiceAmount() {
        if (price_item * items <= 0) {
            return 0;
        } else {
            return price_item * items;
        }
    }

}
