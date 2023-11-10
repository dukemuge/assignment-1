import org.bandaHealth.commons.database.ElfData;
import org.bandaHealth.commons.models.Elf;
import org.bandaHealth.partOne.service.ElfServiceOne;
import org.bandaHealth.partTwo.service.ElfServiceTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class ElfServiceTests {

    List<Elf> elves =  ElfData.getAllElves();
    @BeforeEach
    void setUp() {
        List<Elf> elves =  ElfData.getAllElves();
    }

    @Test
    @DisplayName("The sum of top 3 elves with most calories")
    void testSumOfHighestTop3Calories() {

        assertEquals(45000, ElfServiceTwo.takeSumOfTop3ElvesWithMostCalories(elves),
                "it should only display sum of elves with highest calories");
    }


    @Test
    @DisplayName("The sum of the highest calorie value in elvesLIst ")
    void testHighestSumAggregateValueOfCalorie() {

        assertEquals(24000, ElfServiceOne.getMaximumValueOfCalorieInElfList(elves),
                "it should only display sum of elves with highest calories");
    }

    @Test
    @DisplayName("The name of Elf with maximum calorie")
     void  testNameOfElfWithMaximumCalorie(){
        assertEquals("elf4",ElfServiceOne.getNameOfElfWithMaximumValueOfCalorie(elves),
                "it should display name of elf with highest Calorie content");
    }



}
