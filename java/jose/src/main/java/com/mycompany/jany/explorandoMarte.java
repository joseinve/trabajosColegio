package com.mycompany.jany;

public class explorandoMarte {
    public static void main(String[] args) {
        int n = 4;
        int energia = 0;
        System.out.println(energia);
        int[][] marte = {
                { 1, 4, 1, 1 },
                { 7, 2, 8, 5 },
                { 3, 4, 7, 2 },
                { 4, 1, 3, 2 }
        };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n == 1 & j == 1) {
                    if (marte[i][j] < marte[i][j + 1]) {
                        energia = 1 + (3 * (marte[i][j + 1] - marte[i][j]));
                    } else {
                        energia = 1 + ((marte[i][j + 1] - marte[i][j]));
                    }
                }
                if (marte[i][j] < marte[i + 1][j]) {
                    energia = 1 + (3 * (marte[i][j + 1] - marte[i][j]));
                } else {
                    energia = 1 + ((marte[i + 1][j] - marte[i][j]));
                }
            }
        }
    }
}
