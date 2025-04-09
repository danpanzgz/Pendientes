package UD4;

import entrada.Teclado;

public class Actividad1x04 {

	public static char convertirALetraMayuscula(char c) {
	    if ((c >= 'a' && c <= 'z') || c == 'ñ') {
	        return Character.toUpperCase(c);
	    }
	    return c;
	}

	public static char convertirALetraMinuscula(char c) {
	    if ((c >= 'A' && c <= 'Z') || c == 'Ñ') {
	        return Character.toLowerCase(c);
	    }
	    return c;

	}

	public static void main(String[] args) {
		char caracter = Teclado.leerCaracter("Caracter: ");

		char mayuscula = convertirALetraMayuscula(caracter);
		char minuscula = convertirALetraMinuscula(caracter);

		System.out.println("El caracter " + caracter + " convertido en mayuscula es " + mayuscula);
		System.out.println("El caracter " + caracter + " convertido en minuscula es " + minuscula);
	}

}
