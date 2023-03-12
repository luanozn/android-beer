package com.example.consultordecerveja_luanribeiro.entities;

import com.example.consultordecerveja_luanribeiro.enums.BeerType;

public class Beer {

    private final BeerType type;
    private final String name;
    private final String brand;
    private final int picture;
    private final double value;
    private final String origin;
    private final int creationYear;

    public Beer(BeerType type, String name, String brand, int pictureUrl, double value, String origin, int creationYear) {
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.picture = pictureUrl;
        this.value = value;
        this.origin = origin;
        this.creationYear = creationYear;
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

    public double getValue() {
        return value;
    }

    public String getOrigin() {
        return origin;
    }

    public int getCreationYear() {
        return creationYear;
    }
}
