package org.bandaHealth.commons.database;



import org.bandaHealth.commons.models.Elf;
import org.bandaHealth.commons.models.Food;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElfData {
    public static List<Elf> getAllElves() {
        return Stream.of(
                new Elf(101, "elf1",List.of(new Food(1,1000,101),new Food(2,2000,101),new Food(3,3000,101))),
                new Elf(102, "elf2",List.of(new Food(1,4000,102))),
                new Elf(103, "elf3",List.of(new Food(1,5000,103),new Food(2,6000,103))),
                new Elf(104, "elf4",List.of(new Food(1,7000,104),new Food(2,8000,104),new Food(3,9000,104))),
                new Elf(105, "elf5",List.of(new Food(1,10000,105)))
                ).collect(Collectors.toList());
    }
}
