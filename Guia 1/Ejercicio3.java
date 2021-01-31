package ejercicio3;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sistema para determinar números pares e impares");
	System.out.println("Ingrese la cantidad de números a evaluar: ");
        int cantidad = scanner.nextInt();
        
        for(int i = 0; i < cantidad; i ++) {
		System.out.println("Ingrese un número: ");
		int numero = scanner.nextInt();
		if(numero % 2 == 0) System.out.println("El número: %s, es par".formatted(numero));
		else System.out.println("El número: %s, es impar".formatted(numero));
	}
        scanner.close();
    }
}