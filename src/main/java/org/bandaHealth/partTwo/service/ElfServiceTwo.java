package org.bandaHealth.partTwo.service;


import org.bandaHealth.commons.models.Elf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElfServiceTwo {

    public   static int takeSumOfTop3ElvesWithMostCalories(List<Elf> elves) {
        var maps  = getTop3ElvesWithHighestCalories(elves);
        return calculateSumOfValues(maps);
    }


    public  static int calculateSumOfValues(Map<String, Integer> map) {
        return map.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static  Map<String,Integer>  getTop3ElvesWithHighestCalories(List<Elf> elves){
        var results = elves.stream()
                .collect(Collectors.toMap(elf -> elf.getName(),
                        elf -> elf.getFoods().stream()
                                .map(e -> e.getCalories()).
                                reduce(0,Integer::sum)));
        var maps = results.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        HashMap::new
                ));

        return maps;
    }
}
