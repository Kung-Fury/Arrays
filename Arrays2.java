// EJERCICIO ARRAYS 2
// Programa que pide 10 números al usuario entre 1 y 10. Los guarde dentro de un array y 
// los ordena de mayor a menor.

import java.util.Scanner;

public class Arrays2 {
	
    public static void main(String args[]) 
    {
    	int aux;
    	int i=0;
    
    	Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
        int mat[] = new int[10];
        while (i<10) {
        	System.out.println("Introduce número: ");
        	aux=sc.nextInt();
        		if (aux > 1 && aux < 10) {
        			mat[i]=aux;
        			i++;
        		} else 
        			System.out.println("Número fuera de rango.");
        	
        }
        sc.close();
        ordenar(mat); // se aplica el método ordenar
     }
        
    public static void ordenar(int[] mat) 
    {
        // Se ordena de mayor a menor el array.
    	for(int i=0;i<(mat.length-1);i++){
            for(int j=i+1;j<mat.length;j++){
                if(mat[i]<mat[j]){
                    int aux=mat[i];
                    mat[i]=mat[j];
                    mat[j]=aux;
                }
            }
    	}
    	for (int k = 0; k < mat.length; k++)
            System.out.println("La lista ordenada es: "+mat[k]);
    }
 }
