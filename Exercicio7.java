/* 7. Faça um programa que leia 10 números que o usuário vai informar. Todos os números lidos com valor 
inferior a 40 devem ser somados. Escreva o valor final da soma efetuada. (08/06/2021) */

import java.util. *;
public class Exercicio7 {
public static void main (String [] args) {  
Scanner sc = new Scanner(System.in);
		double numero[] = new double [11];
		double soma = 0;		
		for (int cont = 1; cont < 11; cont++){
		System.out.println ("Digite um numero: ");	
		numero[cont] = sc.nextDouble();
		if (numero[cont] < 40) {
		soma = soma + numero [cont];
		}
		}
System.out.println ("A soma total dos valores (menores que 40) inseridos é: " + soma); 
}
}