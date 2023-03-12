package com.example.consultordecerveja_luanribeiro.enums;

public enum BeerType {

    LAGER,
    PILSEN,
    ALE,
    LAMBIC,
    UNDEFINED;

    public static BeerType from(String typeString) {

        switch (typeString) {
            case "Lager":
                return LAGER;
            case "Pilsen":
                return PILSEN;
            case "Ale":
                return ALE;
            case "Lambic":
                return LAMBIC;
            default:
                return UNDEFINED;
        }

    }
}
