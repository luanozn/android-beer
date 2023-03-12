package com.example.consultordecerveja_luanribeiro.repository;

import static com.example.consultordecerveja_luanribeiro.enums.BeerType.ALE;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.LAGER;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.LAMBIC;
import static com.example.consultordecerveja_luanribeiro.enums.BeerType.PILSEN;

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
                new Beer(LAGER, "Heineken", "Heineken International", "https://www.pngitem.com/pimgs/m/241-2419957_heineken-bottle-transparent-background-png-download-transparent-background.png"),
                new Beer(LAGER, "Stella Artois", "AB InBev", "https://toppng.com/uploads/preview/stella-artois-premium-lager-stella-artois-11563043667nih8eehser.png"),
                new Beer(LAGER, "Corona Extra", "AB InBev", "https://th.bing.com/th/id/OIP.EpfrUf7kq7p0df8POigZgQHaNA?w=120&h=211&c=7&r=0&o=5&dpr=1.3&pid=1.7")
        );

        List<Beer> pilsenBeers = Arrays.asList(
                new Beer(PILSEN, "Eisenbahn", "Brasil Kirin", "https://th.bing.com/th/id/OIP.fbhfXM-eFtkBMtdR5R2YiwHaHa?w=202&h=202&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
                new Beer(PILSEN, "Skol", "Carlsberg", "https://th.bing.com/th/id/OIP.4vu4QhlSfsuGUM_ngKwbIgHaFj?w=244&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"),
                new Beer(PILSEN, "Bavaria", "AMBEV", "data:image/jpeg;base64,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")
        );

        List<Beer> aleBeers = Arrays.asList(
                new Beer(ALE, "BrewDog Punk IPA", "BrewDog", "https://th.bing.com/th/id/R.2114cb181c8615de622112e7c5993aa9?rik=8E4LXN5giunylQ&pid=ImgRaw&r=0"),
                new Beer(ALE, "Leuven Golden Ale King", "Leuven", "https://th.bing.com/th/id/R.8cf6e80dfc7809760ab70f0a2534607f?rik=iY5FWB3c4CP%2frw&pid=ImgRaw&r=0"),
                new Beer(ALE, "Baden Baden Golden Ale", "Baden Baden", "https://th.bing.com/th/id/OIP.CPOiZkkrzBR3rXr__ZYiQwHaHa?w=184&h=184&c=7&r=0&o=5&dpr=1.3&pid=1.7")
        );

        List<Beer> lambicBeers = Arrays.asList(
                new Beer(LAMBIC, "Oud Beersel Framboise", "Oud Beersel", "https://images.tcdn.com.br/img/img_prod/1019433/cerveja_oud_beersel_framboise_375ml_35_1_eb7fb2f4049b6548e66081bffa7a7e85.png"),
                new Beer(LAMBIC, "Oud Beersel Oude Kriek Vieille", "Oud Beersel", "https://images.tcdn.com.br/img/img_prod/1019433/cerveja_oud_beersel_kriek_vieille_375ml_33_1_2a114f0bcb7432a84ee1fcea895b9feb.png"),
                new Beer(LAMBIC, "Oud Beersel Geuze Oude Pijpen", "Oud Beersel", "https://images.tcdn.com.br/img/img_prod/1019433/cerveja_oud_beersel_geuze_oude_pjipen_2017_375ml_41_1_cbe5493de3a8b0f65c46e7028f3557bf.png")
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
