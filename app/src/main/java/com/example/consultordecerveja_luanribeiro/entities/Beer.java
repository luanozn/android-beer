package com.example.consultordecerveja_luanribeiro.entities;

import com.example.consultordecerveja_luanribeiro.enums.BeerType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Beer {

    BeerType type;
    String name;
    String brand;
    String pictureUrl;
}
