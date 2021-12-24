package com.epam.test.automation.java.practice4;

public class Task4 {
    private Task4() {
    }

    public static double sumGeometricElements(int a1, double t, int alim) {
        if (a1 <= 0 || a1 <= alim) throw new IllegalArgumentException("incorrect a1");
        if (t <= 0 || t >= 1) throw new IllegalArgumentException("incorrect t");
        if (alim < 0) throw new IllegalArgumentException("incorrect alim");
        double aFirst = a1;
        double sum = a1;
        double an;

        while (true) {
            an = aFirst * t;
            if (an <= alim || an < 0.01) break;
            sum += an;
            aFirst = an;
        }
        return Math.round(sum);
    }
}
