package java_using_eclipse;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {
	
	/*
	 * El autoboxing y el unboxing permiten escribir codigo mas legible
	 * aceptando la convencion de que un primitivo y su clase wrapper
	 * son en esencia intercanviables de forma casi transparente
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int a = 5;
		
		myMethod(a);	
		
		// Otro ejemplo basico que incluye autoboxing
		// Tecnicamente la lectura es de una cadena, pero como 
		// se le requiere acomodado en un char y este es convertible
		// se convierte automaticamente.
		// Si fuesen 2 caracteres se lanzaria una excepcion de error.
		
		Character ch = 'a'; // Esto es lo que hacemos
		
		Character cha = Character.valueOf('a'); // Pero automaticamente hace esto
		
		/*
		 * Siempre que se pasa o partimos de un primitivo y acabamos con
		 * una wrapper class, significa que se ha producido un autoboxing
		 */
		
		
		//-----------------
		
		/*
		 * Lo mismo sucede del reves si pasamos una wraper class como Integer
		 * a un metodo que recibe int primitivo, el sistema lo convertira
		 * automaticamente a int si es posible.
		 */
		
		
	     List<Double> ld = new ArrayList<>();
	     ld.add(3.1416);    // autoboxing y se convierte a objeto Double dentro del array
	     // porque el valor se puede acomodar

		double pi = ld.get(0);// unboxing y vuelve a se run primitivo
		
		
	     
	     Integer i = -8;

		int absVal = absoluteValue(i); // enviamos Integer y espera int
	     // pero el unboxing los convierte automaticamente
		

	}
	
	/*
	 * metodo que admite int primitvo de entrada. si recibe un Integer
	 * se produce un unboxing automatico si es posible
	 */
    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
	
	/*
	 * Aqui se produce un autoboxing debido a que al recibir
	 * el parametro el metodo este se convierte automaticamente 
	 * a la Wrapper class.
	 */
	
	public static void myMethod(Integer num) {
		System.out.println(num);
		
	}

}
