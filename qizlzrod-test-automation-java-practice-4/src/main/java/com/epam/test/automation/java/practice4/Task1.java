package com.epam.test.automation.java.practice4;

public class Task1 {
    private Task1() {
    }

    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length <= 1) throw new IllegalArgumentException();

        boolean isTrue = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (order == SortOrder.ASC) {
                if (array[i] > array[i + 1]) {
                    isTrue = false;
                    break;
                }
            } else {
                if (array[i] < array[i + 1]) {
                    isTrue = false;
                }
            }
        }
        return isTrue;
    }
}
