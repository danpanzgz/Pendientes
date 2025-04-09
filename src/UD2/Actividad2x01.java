package UD2;

import entrada.Teclado;

public class Actividad2x01 {
	public static void escribirTablaMultiplicar(int num) {
		for (int i = 0; i <= 10; i++) {
			int resultado = i*num;
			System.out.println(num + " x " + i + " = " + resultado);
		}
	}
	
	public static void main (String[] args) {
		int num = Teclado.leerEntero("Introduce un numero: ");
		boolean correcto = (num > 0);
		
		if (correcto) {
			escribirTablaMultiplicar(num);
		} else {
			System.out.println("El numero debe ser positivo");
		}
	}

}
