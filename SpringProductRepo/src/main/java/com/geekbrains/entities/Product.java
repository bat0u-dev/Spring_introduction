package com.geekbrains.entities;

public class Product {
    private int id;
    private String title;
    private double coast;

    public Product(int id, String title, double coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public StringBuilder info(){
        StringBuilder info = new StringBuilder();
        info.append(this.getId());
        info.append(" ");
        info.append(this.getTitle());
        info.append(" ");
        info.append(this.getCoast());
        return info;
    }
}
