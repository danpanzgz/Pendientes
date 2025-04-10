package UD4;

import entrada.Teclado;

public class Actividad2x05 {
	
	public static void main (String []args) {
		int opcion;
		String frase;
		do {
			System.out.println("MENU");
			System.out.println("0) salir del programa");
			System.out.println("1) convertir mayusculas");
			System.out.println("2) convertir minusculas");
			System.out.println();
			
			opcion = Teclado.leerEntero("Opcion: ");
			System.out.println();
			
			switch (opcion) {
			case 1: {
				do {
					frase = Teclado.leerCadena("Frase? ");
					
					if (frase.length() > 60) {
						System.out.println("La frase debe ser menor de 60 caracteres");
					}

				} while (frase.length() > 60);
				
				frase = frase.toUpperCase();
				
				System.out.println(frase);
				System.out.println();

				break;
			}
			
			case 2: {
				do {
					frase = Teclado.leerCadena("Frase? ");
					
					if (frase.length() > 60) {
						System.out.println("La frase debe ser menor de 60 caracteres");
					}

				} while (frase.length() > 60);
				
				frase = frase.toLowerCase();
				
				System.out.println(frase);
				System.out.println();
				
				break;

			}
			default:
				System.out.println("opcion no valida");
			}
		} while (opcion != 0);
	}
}
