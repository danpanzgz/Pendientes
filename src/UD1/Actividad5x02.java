package UD1;

import entrada.Teclado;

public class Actividad5x02 {
	public static void main (String []args) {
		int altura = Teclado.leerEntero("Altura del triangulo? ");
		boolean error = (altura <= 0);
		
		if (error) {
			System.out.println("La altura debe ser positiva");
		} else {
			for (int i = 1; i <= altura; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
