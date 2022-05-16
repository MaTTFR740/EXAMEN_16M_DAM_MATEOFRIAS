package NUMERO_PRIM;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num = 0;

		
		System.out.println("Hola Usuario, soy Mateo");
		

		 System.out.println("Introduce un número para saber si es primo o no");
	        int n0 = ent.nextInt();
	        int indice=1;
	        int r;
	        int primo=0;
	       
	        System.out.println(n0 + "/" + n0 + " = " + n0/n0);
	       
	        while ((n0-indice)>1) {
	            if (n0%(n0-indice)==0) {
	                r=n0/(n0-indice);
	                primo=1;
	                System.out.println(n0 + "/" + (n0-indice) + " = " + r);
	            }
	            indice++;
	        }

	        System.out.println(n0 + "/1 = " + n0);
	       
	        if (primo==0) System.out.println("NUMERO PRIMO"); else System.out.println("NUMERO no PRIMO");
	        System.out.println("\n==========================");
	    }

		
	}
