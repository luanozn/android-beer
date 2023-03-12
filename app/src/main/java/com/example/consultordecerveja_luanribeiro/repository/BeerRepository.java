package com.example.consultordecerveja_luanribeiro.repository;

import static com.example.consultordecerveja_luanribeiro.enums.BeerType.ALE;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.LAGER;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.LAMBIC;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.PILSEN;

import com.example.consultordecerveja_luanribeiro.entities.Beer;
import com.example.consultordecerveja_luanribeiro.enums.BeerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeerRepository {

    public Map<BeerType, List<Beer>> getAll() {
        Map<BeerType, List<Beer>> allBeerTypes = new HashMap<>();

        List<Beer> lagerBeers = Arrays.asList(
                new Beer(),
                new Beer(),
                new Beer()
        );

        List<Beer> pilsenBeers = Arrays.asList(
                new Beer(),
                new Beer(),
                new Beer()
        );

        List<Beer> aleBeers = Arrays.asList(
                new Beer(),
                new Beer(),
                new Beer()
        );

        List<Beer> lambicBeers = Arrays.asList(
                new Beer(),
                new Beer(),
                new Beer()
        );

        allBeerTypes.put(LAGER, lagerBeers);
        allBeerTypes.put(PILSEN, pilsenBeers);
        allBeerTypes.put(ALE, aleBeers);
        allBeerTypes.put(LAMBIC, lambicBeers);

        return allBeerTypes;
    }
}
