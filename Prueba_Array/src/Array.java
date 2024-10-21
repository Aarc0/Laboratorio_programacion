import java.util.*;

public class Array 
{
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		
		System.out.println("Filas: ");
		int F = n.nextInt();
		System.out.println("Columas: ");
		int C = n.nextInt();
		int[][] numeros = new int[F][C];
		
		for(int i = 0; i < F ; i++)
		{
			for(int j = 0; j < numeros[i].length ; j++)
			{
				numeros[i][j] = n.nextInt();
			}
		}
		
	}
}


/*import java.util.*;

public class Array 
{
	public static void main(String[] args) 
	{
		
		Scanner n = new Scanner(System.in);
		System.out.println("Filas: ");
		int F = n.nextInt();
		System.out.println("Columas: ");
		int C = n.nextInt();
		int[][] numeros = new int[F][C];
		//Se le ingresa a la arrey un nº de filas y de columnas
		
		for(int i = 0; i < F ; i++)
		//si i es menor que el numero de filas entra
		{
			
			for(int j = 0; j < C ; j++)
			//si j es menor que el numero de indices que hay en la fila del valor que tenga j, entra 
			{
				numeros[i][j] = n.nextInt();
			}
			
		}
		
	}
}*/