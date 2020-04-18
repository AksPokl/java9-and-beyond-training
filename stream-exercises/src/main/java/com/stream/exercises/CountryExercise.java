package com.stream.exercises;

import com.stream.exercises.entity.City;
import com.stream.exercises.entity.Country;
import com.stream.exercises.util.CountryTestDataUtil;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class CountryExercise {

    public static void main(String[] args) {
        List<Country> countries = CountryTestDataUtil.getCountries();

        //Find the highest populated city of each country
        List<City> highlyPopulatedCity = countries.stream()
                .map(Country::getCities)
                .map(e -> e.stream()
                        .max(comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        //Find the highest populated capital city
        City city = countries.stream()
                .flatMap(e -> e.getCities().stream())
                .filter(City::getCapital)
                .max(comparing(City::getPopulation))
                .orElse(City.empty());
    }
}
