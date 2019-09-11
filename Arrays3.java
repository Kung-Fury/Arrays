// EJERCICIO ARRAYS 3
// Crear un programa que le pida al usuario 5 nombres de productos y los guarde en un array. 
// Si el usuario introduce un nombre repetido que lo vuelva a pedir.

import java.util.Scanner;

public class Arrays3 {
	
    public static void main(String args[]) 
    {
    	String aux;
    	String aux2;
    	int i = 0;
    	boolean repite = false;
    
    	Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
        String[] mat = new String[] {" ", " ", " ", " ", " "};
        while (i<5) {
        	System.out.println("Introduce nombre: ");
        	aux=sc.next();
        		for (int j = 0; j < mat.length; j++) {
        			aux2=mat[j];
        				if (aux2.equals(aux) == true) {
        					repite = true;
        				}
        		}
        			if (repite == false) {
        				mat[i]=aux;
        				i++;
        			} else
        				System.out.println("Nombre repetido");
        			repite = false;	 	
        }
        sc.close();
       // Se muestra la lista de los nombres introducidos.
        for (i=0; i < mat.length; i++) {
        	System.out.println("Nombre " + i+ ": " + mat[i]);
        }   
     }
}
   