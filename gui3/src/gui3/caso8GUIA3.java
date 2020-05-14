package gui3;

import java.util.Scanner;
public class caso8GUIA3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		 while(num < 1 || num > 100) {
			 System.out.print("Ingrese numero: ");
			 num = sc.nextInt();
			 
			 if(num < 1|| num <100)
               System.out.println("numero fuera de rango , [1-100]");
		 }
		 for (int x = 1; x <=15; x+=1) {
			 System.out.println(num + " * "  + x + " = " +(num * x));
               		
               	
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 }

	}

}
