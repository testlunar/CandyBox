package com.company;

public abstract class AbstractCandy {
    String name;
    int weight;
    String description;
    int price;

    public AbstractCandy(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }


}
