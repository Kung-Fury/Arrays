// EJERCICIO ARRAYS 1
// Programa que pide 10 n�meros al usuario entre 1 y 10. Los guarde dentro de un array y 
// finalmente muestra la suma de todos ellos.

import java.util.Scanner;

public class Arrays1 {
	
    public static void main(String args[]) 
    {
    	int aux;
    	int i=0;
    
    	Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
        int mat[] = new int[10];
        while (i<10) {
        	System.out.println("Introduce n�mero: ");
        	aux=sc.nextInt();
        		if (aux > 1 && aux < 10) {
        			mat[i]=aux;
        			i++;
        		} else 
        			System.out.println("N�mero fuera de rango.");
        	
        }
        sc.close();
        suma(mat); // se aplica el m�todo suma
     }
        
    public static void suma(int[] mat) 
    {
        // obtener suma de valores del array
        int suma = 0;
         
        for (int i = 0; i < mat.length; i++)
            suma = suma + mat[i];
         
        System.out.println("La suma de los valores del array es: " + suma);

    }
}
