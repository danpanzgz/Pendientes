package UD1;
import entrada.Teclado;


public class Actividad4x14 {

	public static void main (String [] args) {
		final int SECRETO = 19;
		final int INTENTOS = 5;
		boolean acertado = false; 
		
		for (int i = INTENTOS; i > 0 && acertado; i--) {
			int n = Teclado.leerEntero("Numero? ");
			
			if (n > SECRETO) {
				System.out.println("Has fallado el numero secreto");
				System.out.println("El numero " + n + " es mayor que el numero secreto");
				
			} else if (n < SECRETO) {
				System.out.println("Has fallado el numero secreto");
				System.out.println("El numero " + n + " es menor que el numero secreto");

			} else {
				System.out.println("Has acertado el numero secreto");
				acertado = true;
				
			}
		}
		if (!acertado) {
			System.out.println("Has agotado los 5 intentos");
		}
		
	}
}
