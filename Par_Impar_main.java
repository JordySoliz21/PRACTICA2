package ClassProgram;

import java.util.Scanner;

public class Par_Impar_main 
{

	public static void main(String[] args) 
	{
	  try (Scanner teclado = new Scanner(System.in)) {
		int numero = 0;
		  System.out.println("Ingrese un numero");
		  numero = teclado.nextInt();
		  if (numero %2 == 0)
		  {
		System.out.println("El numero que usted ingreso es par");
		}
		  else
		  {
			  System.out.println("El numero que usted ingreso es impar");
		  }
	}
   }
}
