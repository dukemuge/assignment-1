package org.bandaHealth.partOne.service;


import org.bandaHealth.commons.models.Elf;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElfServiceOne {

    //getting a list of elves and applying max  function from map collection to obtain
    //the map value with the maximum values
    public  static int getMaximumValueOfCalorieInElfList(List<Elf> elfList){

        var results = elfList.stream()
                .collect(Collectors.toMap(elf -> elf.getName(),
                        elf -> elf.getFoods().stream()
                                .map(e -> e.getCalories()).
                                reduce(0,Integer::sum)));
        Map.Entry<String, Integer> maxPrice = results.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        return maxPrice.getValue();

    }

    public static  String getNameOfElfWithMaximumValueOfCalorie(List<Elf> elfList) {
        var results = elfList.stream()
                .collect(Collectors.toMap(elf -> elf.getName(),
                        elf -> elf.getFoods().stream()
                                .map(e -> e.getCalories()).
                                reduce(0,Integer::sum)));

        Map.Entry<String, Integer> maxPrice = results.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        return maxPrice.getKey();
    }
}
