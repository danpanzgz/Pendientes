package UD4;

import entrada.Teclado;

public class Actividad2x03 {
	
	public static void main (String []args) {
		String frase;
		
		do {
			frase = Teclado.leerCadena("Frase? ");
			
			if (frase.length() > 60) {
				System.out.println("La frase debe ser menor de 60 caracteres");
			}
		} while (frase.length() > 60);
		
		int numVoca = 0;
		int numCons = 0;
		String vocales = "";
		String consonantes = "";
		
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			
			if ("aeiouAEIOU".indexOf(c)>= 0) {
				numVoca++;
				vocales += c;
			} else if ("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZñÑ".indexOf(c) >= 0) {
				numCons++;
				consonantes += c;
				
			}
		}
		
		System.out.println("la frase tiene " + numVoca + " vocales" );
		System.out.println("La frase tiene " + numCons + " consonantes");
		System.out.println("Letras vocales " + vocales);
		System.out.println("Letras consonantes " + consonantes);
		
	}

}
