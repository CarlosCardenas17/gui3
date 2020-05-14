package gui3;

import java.util.Scanner;
public class caso6GUIA3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String continuar = "S", nombre = "", estado = "";
		int edad = 0, c = 0, c_aptos = 0;
		
		while (continuar.contentEquals("S")|| continuar.equals("s")){
            c++;
            System.out.println("Registro N, " + c);
            System.out.println("=============");
            
            
            System.out.print("¿Desea continuar <S/N>?; ");
            continuar = sc.nextLine();
            System.out.print("Nombre; ");
            nombre = sc.nextLine();
            System.out.print("edad; ");
            edad = sc.nextInt();
            
            if (edad >=18) {
            	estado = "Apto para votar";
            	c_aptos++;
            }
            else
            	estado = "Menor de edad";
            
            System.out.println("Estado:" + estado);
            
            sc.nextLine();
            System.out.print("¡Deseas continuar <S/N?; ");
            continuar = sc.nextLine();
            }
	}
}
