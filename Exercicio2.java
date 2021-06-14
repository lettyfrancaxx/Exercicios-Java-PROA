/* 2.Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o 
maior deles. (04/06/2021) */

import java.util. *;
public class Exercicio2 {
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
System.out.println ("Informe o primeiro valor: ");  
		int n1 = sc.nextInt(); 
System.out.println ("Informe o segundo valor: ");  
		int n2 = sc.nextInt(); 
System.out.println ("Informe o terceiro valor: ");  
		int n3 = sc.nextInt(); 
if (n1 > n2 && n1 > n3) {
System.out.println ("O primeiro valor, " + n1 + ", é o maior valor.");    
}
else if (n2 > n1 && n2 > n3) {
System.out.println ("O segundo valor, " + n2 + ", é o maior valor."); 
}
if (n3 > n1 && n3 > n2) {
System.out.println ("O terceiro valor, " + n3 + ", é o maior valor."); 
}
}
}
