package ru.netology.statistic;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    private static Stream<Arguments> Incomes() {
        return Stream.of(
                Arguments.of("Test1", new long[]{12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12}, 12),
                Arguments.of("Coverage 100%", new long[]{1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12}, 12),
                Arguments.of("NullTest", new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("Incomes")
    void findMax(String testName, long[] incomesInBillions, long expected) {
        StatisticsService service = new StatisticsService();
        assertEquals(expected, service.findMax(incomesInBillions));
    }
}