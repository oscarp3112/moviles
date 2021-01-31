package ejercicio4;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        lista = new ArrayList<Plano>();
   	String[] cuadrantes = {"primero", "segundo", "tercero", "cuarto"}; 
   	Scanner scan = new Scanner(System.in);
   	
	System.out.print("ingrese la cantidad de puntos: ");
	int cantidad = scan.nextInt();

	for(int i = 0; i < cantidad; i ++) { 
     		System.out.println();
     		System.out.println("Elija un cuadrante segun el numero ");
     		System.out.println("primero (1)"); 
     		System.out.printin("segundo (2)"); 
     		System.out.println("tercero (3)"); 
     		System.out.println("cuarto (4)"); 
     		int numero = scan.nextInt();
     		switch(numero) {
       			case 1:
         			lista.add(registrar(scan, cuadrantes[0]));
         			break;
       			case 2:
         			lista.add(registrar(scan, cuadrantes[1])); 
         			break;
       			case 3:
         			lista.add(registrar(scan, cuadrantes[3])); 
         			break;
       			case 4:
         			lista.add(registrar(scan, cuadrantes[3])); 
         			break;
     		}

   	}

	for(String cuadrante:cuadrantes) {
     		System.out.println("%s cuadrante, total de puntos [%s] ".formatted(cuadrante, lista.stream().filter(x -> x.cuadrante == cuadrante).count() | 0));
   	}
   	scan.close();
    }

    public static Plano registrar(Scanner scan, String cuadrante) {
	System.out.print("ingrese el valor para x: "); 
	int coordenadaX = scan.nextInt();
	System.out.print("ingrese el valor para y: "); 
	int coordenadaY = scan.nextInt();
	return new Plano(cuadrante, coordenadaX, coordenadaY);
    }
}