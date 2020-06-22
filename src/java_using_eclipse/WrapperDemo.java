package java_using_eclipse;

public class WrapperDemo {

	public static void main(String[] args) {

		/* Las clases Wrapper o envoltorio son clases existentes en Java que
		 * permiten usar los tipos de dato primitivos o Primitive Data Types
		 * como si fueran objetos.
		 * Una clase Wraper tiene un solo campo (variable de instancia) con
		 * el tipo primitivo y toda una serie de metodos estaticos (metodo de 
		 * clase) utiles para trabajar con el dato.
		 * Son utiles para llamar a los metodos estaticos que permiten
		 * convertir de cadena a un tipo numerico.
		 * Otro ejemplo de uso seria en los objetos Coleccion como ArrayList
		 * que solo admiten objetos, por lo tanto se ha de usar las clases
		 * Wrapper para incluir numericos.
		 */
		
		String s[] = {"10","60"}; // Son strings
		System.out.println("Sum Before: " + s[0] + s[1]);
		
		int x = Integer.parseInt(s[0]); // Con metodo estatico de string a int
		Integer y = Integer.parseInt(s[1]);
		
		int z = x+y;
		
		System.out.println("Sum After: " + z);
		
	}

}