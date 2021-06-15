/* 6. Faça um programa em Java que leia 10 números informados pelo usuário e ao final da leitura escrever 
a soma total dos 10 números lidos. (08/06/2021) */

 import java.util. *;
 public class Exercicio6 {
 public static void main (String [] args) {  
 Scanner sc = new Scanner (System.in);

 System.out.println ("Informe o primeiro valor: ");  
         double n1 = sc.nextDouble(); 
 System.out.println ("Informe o segundo valor: ");  
         double n2 = sc.nextDouble(); 
 System.out.println ("Informe o terceiro valor: ");  
         double n3 = sc.nextDouble();
 System.out.println ("Informe o quarto valor: ");  
         double n4 = sc.nextDouble();
System.out.println ("Informe o quinto valor: ");  
        double n5 = sc.nextDouble();
System.out.println ("Informe o sexto valor: ");  
        double n6 = sc.nextDouble();
System.out.println ("Informe o sétimo valor: ");  
        double n7 = sc.nextDouble();
System.out.println ("Informe o oitavo valor: ");  
        double n8 = sc.nextDouble();
System.out.println ("Informe o nono valor: ");  
        double n9 = sc.nextDouble();
System.out.println ("Informe o décimo valor: ");  
        double n10 = sc.nextDouble();

double soma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;

System.out.println ("A soma total dos valores inseridos é: " + soma); 

 }
 }