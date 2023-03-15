package ClassProgram;
import java.util.Scanner;

public class Biciesto_main {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			
			System.out.print("Introduce un año: ");
			int year = teclado.nextInt();
			
			boolean esBisiesto = false;
			
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			    esBisiesto = true;
			}
			
	
			if (esBisiesto) {
			    System.out.println(year + " es un año bisiesto");
			} else {
			    System.out.println(year + " no es un año bisiesto");
			}
		}
    }

}
