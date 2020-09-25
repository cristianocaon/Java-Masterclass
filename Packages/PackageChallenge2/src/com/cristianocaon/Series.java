package com.cristianocaon;

public class Series {
    public static int nSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        int fib_0 = 0;
        int fib_1 = 1;
        if(n <= 0) {
            return fib_0;
        } else if(n <= 1) {
            return fib_1;
        } else {
            int i = 2;
            int fib = 0;
            while(i <= n) {
                fib = fib_0 + fib_1;
                fib_0 = fib_1;
                fib_1 = fib;
                i++;
            }
            return fib;
        }
    }
}
