package gui3;

import java.util.Scanner;
public class caso3GUIA3
{

	public static void main(String[] args)
	{
		 
		
      Scanner sc = new Scanner(System.in);
      
      int c = 1, num = 0, factorial = 1;
      
      System.out.print("Ingrese numero: ");
      num = sc.nextInt();
      
      while (c <= num) {
    	  factorial *= c;
    	  c++;
    	  
      }
      System.out.println("El factporial de " + num + " es: " + factorial );
      }

	}



