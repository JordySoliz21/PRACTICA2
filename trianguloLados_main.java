package ClassProgram;

import java.util.Scanner;

public class trianguloLados_main {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("Introduce el lado 1 del triángulo: ");
			double lado1 = teclado.nextDouble();
			
			System.out.print("Introduce el lado 2 del triángulo: ");
			double lado2 = teclado.nextDouble();
			
			System.out.print("Introduce el lado 3 del triángulo: ");
			double lado3 = teclado.nextDouble();
			
			if (lado1 == lado2 && lado2 == lado3) {
			    System.out.println("El triángulo es equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			    System.out.println("El triángulo es isósceles");
			} else {
			    System.out.println("El triángulo es escaleno");
			}
		}
    }

}

