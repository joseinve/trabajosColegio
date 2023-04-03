package com.mycompany.jose;

import java.util.ArrayList;

public class Jose {
    public static void main(String[] args) {
        ArrayList<Integer> hola = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            hola.add(i);
        }
        for (int j = 0; j < hola.size(); j++) {
            System.out.println(hola.get(j));
        }
    }
}
