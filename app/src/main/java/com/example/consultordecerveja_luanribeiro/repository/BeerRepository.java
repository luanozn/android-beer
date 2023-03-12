package com.example.consultordecerveja_luanribeiro.repository;

import static com.example.consultordecerveja_luanribeiro.enums.BeerType.ALE;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.LAGER;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.LAMBIC;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.PILSEN;

import com.example.consultordecerveja_luanribeiro.R;
import com.example.consultordecerveja_luanribeiro.entities.Beer;
import com.example.consultordecerveja_luanribeiro.enums.BeerType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeerRepository {

    private Map<BeerType, List<Beer>> getAll() {
        Map<BeerType, List<Beer>> allBeerTypes = new HashMap<>();

        List<Beer> lagerBeers = Arrays.asList(
                new Beer(LAGER, "Heineken", "Heineken International", R.drawable.heineken),
                new Beer(LAGER, "Stella Artois", "AB InBev", R.drawable.stella),
                new Beer(LAGER, "Corona Extra", "AB InBev", R.drawable.corona)
        );

        List<Beer> pilsenBeers = Arrays.asList(
                new Beer(PILSEN, "Eisenbahn", "Brasil Kirin", R.drawable.eisenbahn),
                new Beer(PILSEN, "Skol", "Carlsberg", R.drawable.skol),
                new Beer(PILSEN, "Bavaria", "AMBEV", R.drawable.bavaria)
                );

        List<Beer> aleBeers = Arrays.asList(
                new Beer(ALE, "BrewDog Punk IPA", "BrewDog", R.drawable.brewdog),
                new Beer(ALE, "Leuven Golden Ale King", "Leuven", R.drawable.leuven),
                new Beer(ALE, "Baden Baden Golden Ale", "Baden Baden", R.drawable.baden)
        );

        List<Beer> lambicBeers = Arrays.asList(
                new Beer(LAMBIC, "Oud Beersel Framboise", "Oud Beersel", R.drawable.framboise),
                new Beer(LAMBIC, "Oud Beersel Oude Kriek Vieille", "Oud Beersel", R.drawable.vieille),
                new Beer(LAMBIC, "Oud Beersel Geuze Oude Pijpen", "Oud Beersel", R.drawable.pijpen)
        );

        allBeerTypes.put(LAGER, lagerBeers);
        allBeerTypes.put(PILSEN, pilsenBeers);
        allBeerTypes.put(ALE, aleBeers);
        allBeerTypes.put(LAMBIC, lambicBeers);

        return allBeerTypes;
    }

    public List<Beer> getBeersByType(BeerType type) {
        return getAll().get(type);
    }
}
