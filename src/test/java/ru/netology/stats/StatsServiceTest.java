package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.shouldCalculateSum(purchases);

        assertEquals(expected, actual);
    }
}