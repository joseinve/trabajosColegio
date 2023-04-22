package com.mycompany.vectores;

import javax.swing.JOptionPane;

public class aerolinea {
    public static void main(String[] args) {
        int clase;
        int[] asientos = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String[] options = { "Si", "No" };
        int decicion;
        boolean bandera = true;
        for (int i = 0; i < 10; i++) {
            clase = Integer
                    .parseInt(JOptionPane.showInputDialog("Introdusca 1 para primera clase o 2 para clase económica"));
            while (bandera) {
                if (clase != 1 || clase != 2) {
                    clase = Integer.parseInt(
                            JOptionPane.showInputDialog("Introdusca 1 para primera clase o 2 para clase económica"));
                } else if (clase == 1 || clase == 2) {
                    bandera = false;
                }
            }
            switch (clase) {
                case 1:
                    for (i = 0; i < 5; i++) {
                        if (asientos[i] != 1) {
                            asientos[i] = 1;
                            break;
                        } else {
                            decicion = JOptionPane.showOptionDialog(null, asientos, null, i, i, null, options, options);
                            if (decicion == 1) {
                            }
                        }
                    }
                    break;
                case 2:
                    for (i = 5; i < 10; i++) {
                        if (asientos[i] != 1) {
                            asientos[i] = 1;
                            break;
                        } else {
                            decicion = JOptionPane.showOptionDialog(null, "¿Quieres cambiar a clase económica?",
                                    "Click a button",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                                    options[0]);
                        }
                    }
                    break;
            }
        }
    }
}