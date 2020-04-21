package com.epsilon.training.model;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String description;
    private Date dateAdded;
    private double price;

    public int getId() {
        return id;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateAdded=" + dateAdded +
                ", price=" + price +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int id, String name, String description, Date dateAdded, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateAdded = dateAdded;
        this.price = price;
    }
}
