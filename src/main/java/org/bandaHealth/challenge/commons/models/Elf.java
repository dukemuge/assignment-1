package org.bandaHealth.challenge.commons.models;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    private int id;
    private String name;
    private List<Food> foods = new ArrayList<>();


    public Elf() {
    }

    public Elf(int id, String name, List<Food> foods) {
        this.id = id;
        this.name = name;
        this.foods = foods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
