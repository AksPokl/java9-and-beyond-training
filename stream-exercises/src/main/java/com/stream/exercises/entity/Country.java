package com.stream.exercises.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@Builder
public class Country {
    private String code;
    private String name;
    private Continent continent;
    private double surfaceArea;
    private int population;
    private double gnp;
    private List<City> cities;
}
