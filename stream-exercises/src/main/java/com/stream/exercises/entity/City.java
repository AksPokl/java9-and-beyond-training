package com.stream.exercises.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class City {
    private int id;
    private String name;
    private int population;
    private String countryCode;
    @Builder.Default
    private Boolean capital = false;

    public static City empty(){
        return City.builder().build();
    }
}
