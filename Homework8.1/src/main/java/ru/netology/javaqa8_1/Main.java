package ru.netology.javaqa8_1;

public class StatisticsService
        public long findMax(long[] incomes) {
            long currentMax = incomes[0];
            for (long income : incomes) {
                if (currentMax < income) {
                    currentMax = income;
                }
            }
            return currentMax;
        }
}