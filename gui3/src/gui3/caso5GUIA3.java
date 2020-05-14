package gui3;

import java.util.Scanner;
public class caso5GUIA3 {

	public static void main(String[] args) {

 Scanner scn= new Scanner (System.in);
 System.out.println("Ingrese numero 1:");
 int n1= scn.nextInt();
 System.out.println("Ingrese numero 2:");
 int n2 = scn.nextInt();
 System.out.println("Ingrese numero 3:");
 int n3 = scn.nextInt();
 System.out.println("Ingrese numero 4:");
 int n4 = scn.nextInt();

 int menor=n1;
 
 if(menor>n2) {
	 
	 menor=n2;
 }
     if(menor>n3) {
    	 menor=n3;
     }
     if(menor>n4) {
    	 menor=n4;
     }
    	 System.out.println("El numero menor : " +menor);
     }
	}


