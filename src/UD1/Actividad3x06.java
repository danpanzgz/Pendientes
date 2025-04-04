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
			else if (ica <= 100) {
				System.out.println("Moderado");
			}
			else if (ica <= 150) {
				System.out.println("No Saludable para Grupos Sensibles");
			}
			else if (ica <= 200) {
				System.out.println("No Saludable para Toos");
			}
			else if (ica <= 300) {
				System.out.println("Insalubre");
			}
			if (ica <= 500) {
				System.out.println("Peligroso");
			}
		}
	}

}
