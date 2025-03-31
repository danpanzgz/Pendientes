package UD1;

import entrada.Teclado;

public class Actividad5x05 {
	public static void main (String []args) {
		int altura = Teclado.leerEntero("numero limite de triangulo? ");
		boolean error = (altura <= 0);
		int n = 1;
		
		if (error) {
			System.out.println("El numero debe ser positiva");
		} else {
			for (int i = 1; i <= altura; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.printf("%-3s", n);
					
				}
				System.out.println();
				n++;
			}
		}
	}

}
