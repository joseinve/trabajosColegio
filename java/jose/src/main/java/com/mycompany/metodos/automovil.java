package com.mycompany.metodos;

public class automovil {
    public static class automoviles {
        int ano;
        int ruedas;
        int puertas;
        String color;

        public void setAno(int ano) {
            this.ano = ano;
        }

        public void setPuertas(int puertas) {
            this.puertas = puertas;
        }

        public void setRuedas(int ruedas) {
            this.ruedas = ruedas;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int ano() {
            return this.ano;
        }

        public String color() {
            return this.color;
        }
    }
}
