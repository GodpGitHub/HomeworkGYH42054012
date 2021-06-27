package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class Beer {
    private String band;
    private double price;

    public Beer(String band, double price) {
        this.band = band;
        this.price = price;
    }
    public Beer(){

    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getSize() {
        return price;
    }

    public void setSize(double size) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "band='" + band + '\'' +
                ", price=" + price +
                '}';
    }

    public List<Beer> getBrands(String color) {
        List<Beer> brands = new ArrayList<>();
        if (color.equals("amber")) {
            Beer a=new Beer("Jack Amber",100);
            Beer b=new Beer("Red Moose",200);
            brands.add(a);
            brands.add(b);
        } else {
            Beer a=new Beer("Jali Pale Ale",500);
            Beer b=new Beer("Gout Stout",1000);
            brands.add(a);
            brands.add(b);
        }
        return brands;
    }
}

