package com.example.consultordecerveja_luanribeiro.service;

import com.example.consultordecerveja_luanribeiro.entities.Beer;
import com.example.consultordecerveja_luanribeiro.enums.BeerType;
import com.example.consultordecerveja_luanribeiro.repository.BeerRepository;

import java.util.List;

public class BeerService {

    private final BeerRepository repository;

    public BeerService(BeerRepository repository) {
        this.repository = repository;
    }

    public List<Beer> getByType(BeerType type) {
        return repository.getBeersByType(type);
    }
}
