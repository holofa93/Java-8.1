package ru.netology.javaqa8_1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class StatisticsServiceTest {

        @Test
        void findMax() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            Assertions.assertEquals(expected, actual);
        }
        @Test
        void findMaxIf() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 15, 8, 6, 11, 11, 12};
            long expected = 15;

            long actual = service.findMax(incomesInBillions);

            Assertions.assertEquals(expected, actual);
    }
}
