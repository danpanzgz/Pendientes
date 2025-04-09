package UD2;

public class Actividad1x07 {
	
	public static boolean esPerfecto(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if(num % i == 0) {
				suma  += i;
			}
		}
		
		
		return (num == suma);
	}
	
	public static void main (String [] args) {

		System.out.println("Numeros perfectos entre 1 y 10000");
		
		final int LIMITE = 10000;

		for(int i = 1; i < LIMITE; i++) {
			if (esPerfecto(i)) {
				System.out.println("El numero: " + i + " es perfecto");
			}
		}
		
		
		
	}

}
