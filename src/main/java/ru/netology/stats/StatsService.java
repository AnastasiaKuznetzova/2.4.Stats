package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int calculateAverage(int[] sales) {
        int sum = calculateSum(sales);
        int average = sum / 12;
        return average;
    }

    public int findMax(int[] values) {
        int currentMax = values[0];
        int numberOfMonth = 0;
        int maxSellNumberMonth = 0;
        for (int value : values) {
            numberOfMonth += 1;
            if (currentMax <= value) {
                currentMax = value;
                maxSellNumberMonth = numberOfMonth;
            }
        }
        return maxSellNumberMonth;
    }

    public int findMin(int[] values) {
        int currentMin = values[0];
        int numberOfMonth = 0;
        int minSellNumberMonth = 0;
        for (int value : values) {
            numberOfMonth += 1;
            if (currentMin >= value) {
                currentMin = value;
                minSellNumberMonth = numberOfMonth;
            }
        }
        return minSellNumberMonth;
    }

    public int calculateMonthMoreAverage(int[] sales) {
        int averege = calculateAverage(sales);
        int sumMoreAverage = 0;
        for (int sale : sales) {
            if (sale > averege) {
                sumMoreAverage++;
            }
        }
        return sumMoreAverage;
    }
    public int calculateMonthLessAverage(int[] sales) {
        int averege = calculateAverage(sales);
        int sumLessAverage = 0;
        for (int sale : sales) {
            if (sale < averege) {
                sumLessAverage++;
            }
        }
        return sumLessAverage;
    }
}



