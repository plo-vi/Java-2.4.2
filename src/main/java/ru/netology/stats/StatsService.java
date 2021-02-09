package ru.netology.stats;

class StatsService {
    public long shouldCalculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }
}