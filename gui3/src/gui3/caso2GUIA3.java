package gui3;


		import java.util.Scanner;
		public class caso2GUIA3
		{

			public static void main(String[] args)
			{
				 
				
		      Scanner sc = new Scanner(System.in);
		      
		      int n = 0;
		      
		      System.out.print("Ingresando numero: ");
		      n = sc.nextInt();
		      
		      int i = 1;
		      int s = 0;
		      
		      while (i <=n) {
		             s += i;
		             i++;
		      }
			System.out.println("La sumatoria de " + n + " es: " + s); 
		    	  
		      }

			}

	

