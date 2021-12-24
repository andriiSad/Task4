package com.epam.test.automation.java.practice4;

public class Task3 {
    private Task3() {
    }

    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) throw new IllegalArgumentException("n<=0");
        if (n == 1) return a1;

        int multiplication = a1;
        int an;
        for (int i = 0; i < n - 1; i++) {
            an = a1 + t;
            multiplication *= an;
            a1 = an;
        }
        return multiplication;

    }
}
