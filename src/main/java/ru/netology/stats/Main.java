package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int largest = purchases[0], index = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] >= largest) {
                largest = purchases[i];
                index = ++i;
            }
        } System.out.println(index);
    }
}
