package ru.geekbrains.persist;

public class Product {
    private String title;
    private double cost;

    public Product() {
    }

    public Product(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
