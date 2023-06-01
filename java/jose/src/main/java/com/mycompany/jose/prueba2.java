package com.mycompany.jose;

public class prueba2 {
    public static void main(String[] args) {
        EAsalariado empleado1 = new EAsalariado(569587, "Javier", "Gómez", 2008, 1225);
        EComision empleado2 = new EComision(695235, "Eva", "Nieto", 2010, 179, 8.1);
        EComision empleado3 = new EComision();
        EAsalariado empleado4 = new EAsalariado();
        empleado3.setDNI(741258);
        empleado3.setNombre("José");
        empleado3.setApellido("Ruiz");
        empleado3.setAnoIngreso(2012);
        empleado3.setClientes(81);
        empleado3.setMontoCliente(8.10);
        empleado3.setSueldo();
        empleado4.setDNI(896325);
        empleado4.setNombre("María");
        empleado4.setApellido("Núñez");
        empleado4.setAnoIngreso(2012);
        empleado4.setSalarioBase(1155);
        empleado4.setSueldo();
        empleado1.imprimir();
        empleado2.imprimir();
        empleado3.imprimir();
        empleado4.imprimir();
    }

    static abstract class Empleado {
        int DNI;
        String nombre;
        String apellido;
        int anoIngreso;
        double sueldo;

        public abstract int obtenerSalario();

        public void imprimir() {
            System.out.println("DNI: " + this.DNI);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Apellido: " + this.apellido);
            System.out.println("Año de ingreso: " + this.anoIngreso);
            System.out.println("Sueldo: " + this.sueldo + "Gs");
            System.out.println("------------------------------------------------");
        }
    }

    static class EAsalariado extends Empleado {
        double salarioBase;

        public int DNI() {
            return this.DNI;
        }

        public String nombre() {
            return this.nombre;
        }

        public String apellido() {
            return this.apellido;
        }

        public int anoIngreso() {
            return this.anoIngreso;
        }

        public double sueldo() {
            return this.sueldo;
        }

        public double salariobase() {
            return this.salarioBase;
        }

        @Override
        public int obtenerSalario() {
            System.out.println(this.sueldo);
            return 0;
        }

        public void setDNI(int dni) {
            this.DNI = dni;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setAnoIngreso(int anoIngreso) {
            this.anoIngreso = anoIngreso;
        }

        public void setSalarioBase(int salarioBase) {
            this.salarioBase = salarioBase;
        }

        public void setSueldo() {
            if ((2023 - this.anoIngreso) < 2) {
                this.sueldo = this.salarioBase;
            } else if ((2023 - this.anoIngreso) >= 2 && (2023 - this.anoIngreso) <= 3) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.05;
            } else if ((2023 - this.anoIngreso) >= 4 && (2023 - this.anoIngreso) <= 7) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.1;
            } else if ((2023 - this.anoIngreso) >= 8 && (2023 - this.anoIngreso) <= 15) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.15;
            } else if (2023 - this.anoIngreso >= 25) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.2;
            }
        }

        EAsalariado() {
        }

        public EAsalariado(int dni, String nombre, String apellido, int anoIngreso, int salarioBase) {
            this.DNI = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.anoIngreso = anoIngreso;
            this.salarioBase = salarioBase;
            if ((2023 - this.anoIngreso) < 2) {
                this.sueldo = this.salarioBase;
            } else if ((2023 - this.anoIngreso) >= 2 && (2023 - this.anoIngreso) <= 3) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.05;
            } else if ((2023 - this.anoIngreso) >= 4 && (2023 - this.anoIngreso) <= 7) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.1;
            } else if ((2023 - this.anoIngreso) >= 8 && (2023 - this.anoIngreso) <= 15) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.15;
            } else if (2023 - this.anoIngreso >= 25) {
                this.sueldo = this.salarioBase + this.salarioBase * 0.2;
            }
        }
    }

    static class EComision extends Empleado {
        int clientes;
        double montoCliente;

        public int DNI() {
            return this.DNI;
        }

        public String nombre() {
            return this.nombre;
        }

        public String apellido() {
            return this.apellido;
        }

        public int anoIngreso() {
            return this.anoIngreso;
        }

        public int clientes() {
            return this.clientes;
        }

        public double montoCliente() {
            return this.montoCliente;
        }

        public void setDNI(int dni) {
            this.DNI = dni;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setAnoIngreso(int anoIngreso) {
            this.anoIngreso = anoIngreso;
        }

        EComision() {
        }

        public void setClientes(int clientes) {
            this.clientes = clientes;
        }

        public void setMontoCliente(Double montoCliente) {
            this.montoCliente = montoCliente;
        }

        public void setSueldo() {
            if (this.montoCliente * this.clientes < 750) {
                this.sueldo = 750;
            } else {
                this.sueldo = this.montoCliente * this.clientes;

            }
        }

        public EComision(int dni, String nombre, String apellido, int anoingreso, int clientes, double montoCliente) {
            this.DNI = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.anoIngreso = anoingreso;
            this.clientes = clientes;
            this.montoCliente = montoCliente;
            this.sueldo = this.montoCliente * this.clientes;
        }

        @Override
        public int obtenerSalario() {
            System.out.println(this.sueldo);
            return 0;
        }
    }
}