package com.mycompany.POO;

import com.mycompany.metodos.automovil;

public class poo {
    public static void main(String[] args) {
        automovil.automoviles carro = new automovil.automoviles();
        carro.setAno(2020);
        carro.setPuertas(4);
        carro.setRuedas(4);
        carro.setColor("negro");
        System.out.println(carro.ano());
        automovil.automoviles moto = new automovil.automoviles();
        moto.setAno(2010);
        moto.setPuertas(0);
        moto.setRuedas(2);
        moto.setColor("negro");
        System.out.println(moto.ano());

    }
}
// tipo de datos
// imc
// piano
// arraylist
// musica
// censo
// 3iguales
// 3cartas
// holamundo android
// dispocición android
// poo