package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		
		
		
		
		System.out.println(trabajador1.devuelveDatos());
			
		System.out.println(trabajador2.devuelveDatos());
		
		
	}
}


class Empleados{
	
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	
	public void cambiaSeccion(String seccion) { //setter
		this.seccion=seccion;
	}
	
	/*
	public void cambiaNombre(String nombre) { //setter
		this.nombre=nombre;
	}
	*/
	
	
	public String devuelveDatos() {
		return "El nombres es: " + nombre + " y la sección es " + seccion + " y el Id=" + Id;
	}
	
		
	
	private final String nombre; // el final permite que por medio de un setter no se pueda cambiar el valor de la variable, esto es una constante
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
	
	
}








