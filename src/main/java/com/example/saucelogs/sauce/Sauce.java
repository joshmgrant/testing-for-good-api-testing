package com.example.saucelogs.sauce;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.*;

public class Sauce {
    private final Long id;

    @NotNull(message = "name is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
    private final String name;

    @NotNull(message = "description is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
    private final String description;

    @NotNull(message = "heat level is required")
    @Positive(message = "Heat level is a value between 1 and 10")
    private final Integer heatLevel;

    public Sauce(Long id, String name, String description, Integer heatLevel){
        this.id = id;
        this.name = name;
        this.description = description;
        this.heatLevel = heatLevel;
    }

    @Id
    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public Integer getHeatLevel(){
        return this.heatLevel;
    }

    public Sauce updateWith(Sauce sauce){
        return new Sauce(this.id, sauce.name, sauce.description, sauce.heatLevel);
    }

    


    
}