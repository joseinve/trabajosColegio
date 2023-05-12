package com.mycompany.POO.herencia;

public class herencia {
    public class Deporte {
        // Contiene el nombre del deporte
        private String nombre;
        // Contiene el número de equipos que participan en el deporte
        private int numeroDeEquipos;
        // Contiene el número de jugadores de cada equipo
        private int[] numeroDeJugadores;

        public Deporte(String nombre, int numeroDeEquipos, int[] numeroDeJugadores) {
            this.nombre = nombre;
            this.numeroDeEquipos = numeroDeEquipos;
            this.numeroDeJugadores = numeroDeJugadores;
        }
    }

    public class futbol extends Deporte {
        int[] goles;

        public futbol(String nombre, int numeroDeEquipos, int[] numeroDeJugadores) {
            super(nombre, numeroDeEquipos, numeroDeJugadores);
            // TODO Auto-generated constructor stub
        }

    }
}
