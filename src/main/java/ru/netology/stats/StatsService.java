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
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int stat : stats) {
            // stats[minMonth] - продажи в месяце maxMonth
            // stat - продажи в рассматриваемом месяце
            if (stat >= stats[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int findLowSales(int[] stats) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int stat : stats) {
            // stats[minMonth] - продажи в месяце minMonth
            // stat - продажи в рассматриваемом месяце
            if (stat <= stats[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int minSalesMonth(int[] stats) {
        int minMonth = 0; // переменная для  рассчета количества месяцев, у которых продажи были ниже среднего
        for (long stat : stats) {
            if (stat < calculateAverage(stats)) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }

    public int maxSalesMonth(int[] stats) {
        int maxMonth = 0; // переменная для  рассчета количества месяцев, у которых продажи были выше среднего
        for (long stat : stats) {
            if (stat > calculateAverage(stats)) {
                maxMonth = maxMonth + 1;
            }
        }
        return maxMonth;
    }
}

