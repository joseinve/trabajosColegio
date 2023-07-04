package com.mycompany.fibonachi;

public class Fibonachi {

    public static void fibonachi(int c) {
        int fibonacchi = 1;
        int f0 = 0;
        int f1 = 1;
        for (int n = 0; n < c + 1; n++) {
            if (n < 2) {
                continue;
            }
            f0 = fibonacchi;
            f1 = f0 - f1;
            fibonacchi = (f0) + (f1);
        }
        System.out.print(fibonacchi);
    }
}
