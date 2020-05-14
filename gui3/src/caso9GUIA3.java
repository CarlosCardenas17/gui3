
		import java.util.Scanner;

		public class caso9GUIA3 {

		    
		    public static void main(String[] args) 
		    {
		    	
		    	
		    	Scanner sc = new Scanner(System.in);
		     
		          
		         
		         
		         String continuar = "S", nombre = "", estado = "";
		 		int  c = 0, c_aptos = 0;
		 		
		 		while (continuar.contentEquals("S")|| continuar.equals("s")){
		             c++;
		             System.out.println("Registro N, " + c);
		             System.out.println("=============");
		             
		             
		             System.out.print("¿Desea continuar <S/N>?; ");
		             continuar = sc.nextLine();
		             
		            int asistencia;
		            int nota1;
		        	int nota2;
		         	int nota3;
		              
		         	 System.out.print("ingresa asistencia: ");
		         	 asistencia = sc.nextInt(); 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		         	 
		              System.out.println("ingrese nota1: ");
		         	   nota1 = sc.nextInt();
		         	
		         	  
		         	   System.out.println("ingrese nota2: ");
		         	   nota2 = sc.nextInt();
		         	   
		         	   
		         	   System.out.println("ingrese nota3: ");
		         	   nota3 = sc.nextInt();
		         	   
		              float promedio;
		              
		              promedio=(nota1+nota2+nota3)/3;
		              
		              System.out.println("promedio: " + promedio);
		           
		             //condicion
		              
		             if (promedio <=13) {
		            	
		                  	estado = "No obtiene certificado";
		             }
		             else
		  if (asistencia >=8) {   //el 70%porciento de asistencias es 8
		             	estado = "optiene el certificado";
		             	c_aptos++;
		             }
		  else
			  estado = "No obtiene certificado";
		             
		             System.out.println("Estado: " + estado);
		             
		             sc.nextLine();
		             System.out.print("¡Deseas continuar <S/N?; ");
		             continuar = sc.nextLine();
		         
		         
		         
		         
		         
		 		}
		         
		         
		    }
		    
		}
