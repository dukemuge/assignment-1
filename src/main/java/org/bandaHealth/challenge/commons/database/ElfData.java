package org.bandaHealth.challenge.commons.database;

import org.bandaHealth.challenge.commons.models.Elf;
import org.bandaHealth.challenge.commons.models.Food;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElfData {
    public static List<Elf> getAll() {
        return Stream.of(
                new Elf(101, "elf1",List.of(new Food(1000),new Food(2000),new Food(3000))),
                new Elf(102, "elf2",List.of(new Food(4000))),
                new Elf(103, "elf3",List.of(new Food(5000),new Food(6000))),
                new Elf(104, "elf4",List.of(new Food(7000),new Food(8000),new Food(9000))),
                new Elf(105, "elf5",List.of(new Food(10000)))
                ).collect(Collectors.toList());
    }
}
