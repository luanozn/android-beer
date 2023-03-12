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
                new Beer(LAGER, "Heineken", "Heineken International", R.drawable.heineken, 8.99, "Holanda", 1863),
                new Beer(LAGER, "Stella Artois", "AB InBev", R.drawable.stella, 5.99, "Bélgica",1366),
                new Beer(LAGER, "Corona Extra", "AB InBev", R.drawable.corona, 7.99, "México", 1949)
        );

        List<Beer> pilsenBeers = Arrays.asList(
                new Beer(PILSEN, "Eisenbahn", "Brasil Kirin", R.drawable.eisenbahn, 6.99, "Brasil", 2002),
                new Beer(PILSEN, "Skol", "Carlsberg", R.drawable.skol, 3.99, "Brasil", 1967),
                new Beer(PILSEN, "Bavaria", "AMBEV", R.drawable.bavaria, 2.50, "Brasil", 2000)
                );

        List<Beer> aleBeers = Arrays.asList(
                new Beer(ALE, "BrewDog Punk IPA", "BrewDog", R.drawable.brewdog, 13.50, "Escócia", 2007),
                new Beer(ALE, "Leuven Golden Ale King", "Leuven", R.drawable.leuven, 15.50, "Brasil", 2010),
                new Beer(ALE, "Baden Baden Golden Ale", "Baden Baden", R.drawable.baden, 16.50, "Brasil", 1999)
        );

        List<Beer> lambicBeers = Arrays.asList(
                new Beer(LAMBIC, "Oud Beersel Framboise", "Oud Beersel", R.drawable.framboise, 180.50, "Beersel", 1882),
                new Beer(LAMBIC, "Oud Beersel Oude Kriek Vieille", "Oud Beersel", R.drawable.vieille, 255.0, "Beersel", 1882),
                new Beer(LAMBIC, "Oud Beersel Geuze Oude Pijpen", "Oud Beersel", R.drawable.pijpen, 220.50, "Beersel", 1882)
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
