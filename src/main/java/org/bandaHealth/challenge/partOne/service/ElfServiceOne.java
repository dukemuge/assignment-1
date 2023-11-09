package org.bandaHealth.challenge.partOne;

import org.bandaHealth.challenge.commons.models.Elf;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElfServiceOne {
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
