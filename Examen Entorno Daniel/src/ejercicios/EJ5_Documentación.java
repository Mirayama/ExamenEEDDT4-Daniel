package ejercicios;
/**
 * 
 * @author Daniel
 * @version 1.2
 */
public class EJ5_Documentación {

	public static void main(String[] args) {
		System.out.println(operacionSuma(5, 10));
		saludo();
	}

	/**
	 * Método que suma dos valores
	 * @param x, es el primer valor que usaremos en la suma
	 * @param y, es el segundo valor que usaremos en la suma
	 * @return devuelve el valor de la suma
	 * @see <a href="www.google.es"> link </a>
	 * @since 1.0
	 */
	public static int operacionSuma(int val1, int val2) {
		int suma = val1 + val2;
		return suma;
	}	
	
	public static void saludo() {
		System.out.println("Saludos amigo");
	}
}