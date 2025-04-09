package UD2;

public class Actividad1x08 {
	public static boolean sonAmigos(int num1, int num2) {
		int suma1 = 0;
		int suma2 = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				suma1 += i;
			}
		}
		for (int j = 1; j < num2; j++) {
			if (num2 % j == 0) {
				suma2 += j;
			}
		}
				
		return ((num1 == suma2) && (num2 == suma1));
	}

	public static void main (String []args){
		final int LIMITE = 500;
		
		for(int i = 1; i<LIMITE; i++) {
			for(int j = 1; j<LIMITE; j++) {
				if (sonAmigos(i, j)) {
					System.out.println("El numero: " + i + " y el numero: " + j + " son amigos");
				}
			}
		}
	}
}
