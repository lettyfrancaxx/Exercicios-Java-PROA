/* 3. Faça um programa que leia 3 valores (considere que não serão informados valores iguais) e escreva a 
soma dos 2 maiores. (04/06/2021) */

import java.util. *;
public class Exercicio3 {
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
System.out.println ("Informe o primeiro valor: ");  
		int n1 = sc.nextInt(); 
System.out.println ("Informe o segundo valor: ");  
		int n2 = sc.nextInt(); 
System.out.println ("Informe o terceiro valor: ");  
		int n3 = sc.nextInt(); 
if (n1 > n2 && n1 > n3 && n2 > n3 || n2 > n1 && n2 > n3 && n1 > n3) {
        int soma = n1 + n2;
System.out.println ("A soma dos dois maiores valores é: " + soma);    
}
else if (n1 > n2 && n1 > n3 && n3 > n2 || n3 > n1 && n3 > n2 && n1 > n2) {
        int soma = n1 + n3;
System.out.println ("A soma dos dois maiores valores é: " + soma);    
}
if (n3 > n2 && n3 > n1 && n2 > n1 || n2 > n1 && n2 > n3 && n3 > n1) {
        int soma = n2 + n3;
System.out.println ("A soma dos dois maiores valores é: " + soma);  
}
}
}
