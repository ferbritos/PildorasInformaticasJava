package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		
		mifurgoneta1.establece_color("Azul"); //m�todo heredado
		
		mifurgoneta1.configura_asientos("Si"); //m�todo heredado
		
		mifurgoneta1.configura_climatizador("Si"); //m�todo heredado
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
				
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());
		
	}

}
