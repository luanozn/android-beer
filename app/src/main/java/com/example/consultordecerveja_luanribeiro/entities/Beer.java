package com.example.consultordecerveja_luanribeiro.entities;

import com.example.consultordecerveja_luanribeiro.enums.BeerType;

public class Beer {

    private final BeerType type;
    private final String name;
    private final String brand;
    private final String pictureUrl;

    public Beer(BeerType type, String name, String brand, String pictureUrl) {
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.pictureUrl = pictureUrl;
    }

    public BeerType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }
}
