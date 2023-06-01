package com.mycompany.POO;

public class ejercicio1 {
    // Un teatro se caracteriza por su nombre y su dirección y en él se realiza una
    // función al día.
    // La función tiene un nombre y un precio. Realice el diseño de clases e indique
    // qué métodos (get, set)tendría la clase,
    // teniendo en cuenta que se pueda cambiar el nombre del teatro y el nombre y
    // precio de la función. Implemente dichas clases.
    public static void main(String[] args) {
        teatros teatro1 = new teatros();
        teatros teatro = new teatros();
        funciones funcion = new funciones();
        teatro.nombre();
        funcion.precio();
    }
}

class teatros {
    String nombre;
    String funcion;
    int precio;

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String nombre() {
        return this.nombre;
    }
}

class funciones {
    String teatro;
    String funcion;
    int precio;

    public void setfuncion(String Nombre) {
        this.teatro = Nombre;
    }

    public String funcion() {
        return this.teatro;
    }

    public void setprecio(int precio) {
        precio = precio + 3;
    }

    public int precio() {
        return this.precio;
    }
}
