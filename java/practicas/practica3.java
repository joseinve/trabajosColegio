package practicas;

import javax.swing.JOptionPane;
public class practica3 {		
public static void main(String[] args) {
	String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
	System.out.println("Bienvenido "+nombre);
	JOptionPane.showMessageDialog(null, "Bienvenido "+nombre, nombre, 3);
}
}
