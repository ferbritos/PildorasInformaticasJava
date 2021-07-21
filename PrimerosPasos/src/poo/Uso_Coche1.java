package poo;

public class Uso_Coche1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault=new Coche(); //Instanciar una clase, ejemplar de clase
		
		// no debe permitir cambiar el valor y lo declaro en la clase Coche
		//Renault.rueda = 3;
		
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
		
		//System.out.println(Renault.dime_largo());

		Coche1 micoche=new Coche1();
		
		// modificar el color del coche
		
		//micoche.establece_color(); //si esto se comenta, se imprime NULL
		
		micoche.establece_color("amarillo"); // los datos así se pueden reemplazar con el ingreso del usuario "joptionpane"
		
		// imprimir el consola el color
		
		//System.out.println(micoche.dime_color());
		
		
		System.out.println(micoche.dime_datos_generales());
		
		
		micoche.configura_asientos("si");
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador("si");
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El presio final del coche es: "+ micoche.precio_coche());
		
		
		
	}

}
