package org.bandaHealth.challenge;

import org.bandaHealth.challenge.commons.database.ElfData;
import org.bandaHealth.challenge.commons.models.Elf;
import org.bandaHealth.challenge.partOne.ElfServiceOne;
import org.bandaHealth.challenge.partTwo.ElfServiceTwo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Elf> elfs = ElfData.getAll();
        System.out.println("The sum of top 3 elves with most calories is ------>"+ElfServiceTwo.takeSumOfTop3ElvesWithMostCalories2(elfs));
        System.out.println("name and values of top 3 elves with highest calories--->"+ElfServiceTwo.getTop3ElvesWithHighestCalories(elfs));
        System.out.println("Maximum value of Calorie in Elves list is ---->"+ElfServiceOne.getMaximumValueOfCalorieInElfList(elfs));
        System.out.println("The name of Elf with maximum calorie is ----->"+ElfServiceOne.getNameOfElfWithMaximumValueOfCalorie(elfs));

    }
}