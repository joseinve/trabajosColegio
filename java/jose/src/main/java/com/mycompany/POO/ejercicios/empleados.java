package com.mycompany.POO.ejercicios;

public class empleados {
    public static void main(String[] args) {
    }

    public class jefeZona {
    }

    public class empleado {
        String nombre;
        String apellido;
        String direccion;
        int DNI;
        int antiguedad;
        int telefono;
        int salario;
        jefeZona supervisor = new jefeZona();

        public empleado(String nombre, String apellido, int DNI, String direccion, int antiguedad, int telefono,
                int salario, jefeZona supervisor) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.DNI = DNI;
            this.direccion = direccion;
            this.antiguedad = antiguedad;
            this.telefono = telefono;
            this.salario = salario;
        }

        public String nombre() {
            return this.nombre;
        }

        public String apellido() {
            return this.apellido;
        }

        public int DNI() {
            return this.DNI;
        }

        public int antiguedad() {
            return this.antiguedad;
        }

        public int telefono() {
            return this.telefono;
        }

        public int salario() {
            return this.salario;
        }

        public jefeZona supervisor() {
            return this.supervisor;
        }

        public void cambiarSupervisor(jefeZona supervisor) {
            this.supervisor = supervisor;
        }

        public void cambiarSalario(int salario) {
            this.salario = salario;
        }
    }

    public class secretario {
        String despacho;
        int fax;
        int salario;
    }
}
