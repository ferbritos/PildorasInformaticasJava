import javax.swing.*;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		
	/*	String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		System.out.println("Hola " + nombre_usuario + ". Tienes " + edad + " a?os");
	 */
	
		
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad); // convierte la edad que est? en string a int
		
		System.out.println("Hola " + nombre_usuario + ". El a?o que viene tendr?s " + (edad_usuario+1) + " a?os");

	
	
	}

}
