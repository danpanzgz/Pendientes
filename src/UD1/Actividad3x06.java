package UD1;

import entrada.Teclado;

public class Actividad3x06 {
	public static void main(String[] args) {
		int ica = Teclado.leerEntero("Indice de calidad del aire ?: ");
		boolean vica = (ica >= 0 && ica <= 500);

		if (!vica) {
			System.out.println("El indice de calidad del aire debe estar entre 0 y 500");
		} else {
			if (ica <= 50) {
				System.out.println("Bueno");
			}
			if (ica >= 51 && ica <= 100) {
				System.out.println("Moderado");
			}
			if (ica >= 101 && ica <= 150) {
				System.out.println("No Saludable para Grupos Sensibles");
			}
			if (ica >= 151 && ica <= 200) {
				System.out.println("No Saludable para Toos");
			}
			if (ica >= 201 && ica <= 300) {
				System.out.println("Insalubre");
			}
			if (ica >= 301 && ica <= 500) {
				System.out.println("Peligroso");
			}
		}
	}

}
