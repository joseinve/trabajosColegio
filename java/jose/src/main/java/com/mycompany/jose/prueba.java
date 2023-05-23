package com.mycompany.jose;

public class prueba {
    public static void main(String[] args) {
        int[] c = new int[6];
        c[2] = 1;
        for (int i = 0; i < 3650; i++) {
            c[0]++;
            if (c[0] == 10) {
                c[0] = 0;
                c[1]++;
            }
            if (c[1] == 6) {
                c[1] = 0;
                c[2]++;
            }
            if (c[2] == 10) {
                c[2] = 0;
                c[3]++;
            }
            if (c[3] == 6) {
                c[3] = 0;
                c[4]++;
            }
            if (c[4] == 10) {
                c[4] = 0;
                c[5]++;
            }
        }
        System.out.println(c[5] + "" + c[4] + ":" + c[3] + "" + c[2] + ":" + c[1] + "" + c[0]);
    }
}
