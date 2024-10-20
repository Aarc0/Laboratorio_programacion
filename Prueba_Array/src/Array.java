import java.util.*;

public class Array 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		String[] nombres = {"Natalia", "Andrés"};
		System.out.println(nombres[0]);		
		System.out.println(nombres[1]);
		System.out.println("Ingrese la lóngitud de la array");
		int cantidad = n.nextInt();
		int[] numeros = new int[cantidad];
		for(int i = 0; i<cantidad; i++)
		{
			System.out.println("Ingrese el valor de la fila " + (i+1) + " de la string");
			numeros[i] = n.nextInt();
			System.out.println(numeros[i]);
		}
	}
}
