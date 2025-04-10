package UD4;

import entrada.Teclado;

public class Actividad2x06 {

	public static void main(String[] args) {

		String frase;

		do {
			frase = Teclado.leerCadena("Frase? ");

			if (frase.length() > 40 || frase.length() < 5) {
				System.out.println("La frase debe estar entre 5 y 40 caracteres");
			}
		} while (frase.length() > 40 || frase.length() < 5);
		
		String resultado = "";

		for (int i = 0; i < frase.length(); i++) {			
				char c = frase.charAt(i);
				resultado += c;
				System.out.println(resultado);

			
		}
	}

}
