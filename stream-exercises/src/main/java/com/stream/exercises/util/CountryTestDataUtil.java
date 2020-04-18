package com.stream.exercises.util;

import com.stream.exercises.entity.City;
import com.stream.exercises.entity.Continent;
import com.stream.exercises.entity.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryTestDataUtil {
    private static List<Country> countries;

    static {
        countries = new ArrayList<>();
        countries.add(Country.builder()
                .name("Belarus")
                .continent(Continent.EUROPE)
                .cities(List.of(City.builder()
                                .id(1)
                                .population(10000000)
                                .name("Minsk")
                                .countryCode("MIN")
                                .capital(true)
                                .build(),
                        City.builder()
                                .name("Brest")
                                .id(4)
                                .population(300000)
                                .countryCode("BRE")
                                .build()))
                .build());

        countries.add(Country.builder()
                .name("Germany")
                .continent(Continent.EUROPE)
                .cities(List.of(City.builder()
                                .id(2)
                                .population(100000000)
                                .name("Berlin")
                                .countryCode("BER")
                                .capital(true)
                                .build(),
                        City.builder()
                                .name("Hamburg")
                                .id(3)
                                .population(300000)
                                .countryCode("HAM")
                                .build()))
                .build());

        countries.add(Country.builder()
                .name("The USA")
                .continent(Continent.NORTH_AMERICA)
                .cities(List.of(City.builder()
                                .id(5)
                                .population(500000000)
                                .name("New York")
                                .countryCode("NYC")
                                .build(),
                        City.builder()
                                .id(6)
                                .name("Los Angeles")
                                .population(45000000)
                                .countryCode("LOS")
                                .build()))
                .build());
    }

    public static List<Country> getCountries() {
        return countries;
    }
}
