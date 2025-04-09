package UD4;

import entrada.Teclado;

public class Actividad1x02 {
	public static void main(String[] args) {
		char caracter = Teclado.leerCaracter("Introduce un caracter: ");

		if (caracter >= 'a' && caracter <= 'z' || caracter == 'ñ') {
			System.out.println("Es minuscula");
		} else if (caracter >= 'A' && caracter <= 'Z' || caracter == 'Ñ') {
			System.out.println("Es mayuscula");
		} else {
			System.out.println("Caracter no valdio");
		}
	}

}
