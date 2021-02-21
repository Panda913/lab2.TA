package com.company;


public class Task2 {

    public static int recursion_method(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return recursion_method(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return recursion_method(m - 1, recursion_method(m, n - 1));
        } else {
            return 0;
        }
    }
}
