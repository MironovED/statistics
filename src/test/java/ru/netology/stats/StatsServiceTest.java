package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindTopSale() {
        StatsService service = new StatsService();
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findTopSales(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLowSale() {
        StatsService service = new StatsService();
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findLowSales(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinMonth() {
        StatsService service = new StatsService();
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.minSalesMonth(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxMonth() {
        StatsService service = new StatsService();
        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.maxSalesMonth(stats);
        assertEquals(expected, actual);
    }
}