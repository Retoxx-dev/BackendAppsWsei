package com.company;

public class Main {
    public static int searchIndex(int[] array, int value) {
        int index = 0;
        int limit = array.length - 1;
        while (index <= limit) {
            int point = (int)Math.ceil((index + limit) / 2);
            double entry = array[point];
            if (value > entry) {
                index = point+ 1;
                continue;
            }
            if (value < entry) {
                limit = point - 1;
                continue;
            }
            return point; // value == entry
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[] {4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        var index = searchIndex(array, 11); // we want to find index for 11

        System.out.println(index);  // 3
    }
}
