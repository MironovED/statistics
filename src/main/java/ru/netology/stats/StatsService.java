package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] stats) {
        int sum = 0;
        for (int stat : stats) {
            sum = sum + stat;
        }
        return sum;
    }

    public int calculateAverage(int[] stats) {
        return calculateSum(stats) / stats.length;
    }

    public int findTopSales(int[] stats) {
        int currentMax = stats[0];
        for (int stat : stats) {
            if(stat > currentMax) {
                currentMax = stat;
            }
        }
        return currentMax;
    }

    public int findLowSales(int[] stats) {
        int currentMin = stats[0];
        for (int stat : stats) {
            if(stat < currentMin) {
                currentMin = stat;
            }
        }
        return currentMin;
    }

    public int minSalesMonth(int[] stats) {
        int minMonth = 0; // переменная для  рассчета количества месяцев, у которых продажи были ниже среднего
        for (long stat : stats) {
            if (stat < calculateSum(stats) / stats.length) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }

    public int maxSalesMonth(int[] stats) {
        int minMonth = 0; // переменная для  рассчета количества месяцев, у которых продажи были выше среднего
        for (long stat : stats) {
            if (stat > calculateSum(stats) / stats.length) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }
}

