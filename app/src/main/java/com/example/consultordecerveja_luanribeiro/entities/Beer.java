package com.example.consultordecerveja_luanribeiro.entities;

import com.example.consultordecerveja_luanribeiro.enums.BeerType;

public class Beer {

    private final BeerType type;
    private final String name;
    private final String brand;
    private final int picture;

    public Beer(BeerType type, String name, String brand, int pictureUrl) {
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.picture = pictureUrl;
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

    public int getPicture() {
        return picture;
    }
}
