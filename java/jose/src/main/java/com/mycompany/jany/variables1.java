package com.mycompany.jany;

public class variables1 {
    public static void main(String[] args) {
        int h = 535763;
        double s = h / (24 * 7);
        double d = h % (24 * 7) / 24;
        double o = h % 24;
        System.out.println(h + " equivale a " + s + " semanas " + d + " dias " + o + " horas ");
    }
}
