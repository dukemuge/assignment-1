package org.bandaHealth;


import org.bandaHealth.commons.database.ElfData;
import org.bandaHealth.commons.models.Elf;
import org.bandaHealth.partOne.service.ElfServiceOne;
import org.bandaHealth.partTwo.service.ElfServiceTwo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Elf> elves = ElfData.getAllElves();
        System.out.println("The sum of top 3 elves with most calories is ------>"+ ElfServiceTwo.takeSumOfTop3ElvesWithMostCalories(elves));
        System.out.println("name and values of top 3 elves with highest calories--->"+ElfServiceTwo.getTop3ElvesWithHighestCalories(elves));
        System.out.println("Maximum value of Calorie in Elves list is ---->"+ ElfServiceOne.getMaximumValueOfCalorieInElfList(elves));
        System.out.println("The name of Elf with maximum calorie is ----->"+ElfServiceOne.getNameOfElfWithMaximumValueOfCalorie(elves));

    }
}