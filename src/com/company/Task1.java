package com.company;

public class Task1 {

    public static int iteration_method(int n) {
        int res_iteration = 0;
        while (n != 0) {
            res_iteration += n % 10;
            n /= 10;
        }
        return res_iteration;
    }

    public static int recursion_method(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + recursion_method(n / 10);
    }
}

