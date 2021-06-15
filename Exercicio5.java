/* 5. Escreva um programa em Java que exiba verdadeiro ou falso se os dois números inseridos pelo usuário
 são positivos ou negativos. (08/06/2021) */

import java.util. *;
public class Exercicio5 {
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
System.out.println ("Informe o primeiro valor: ");  
		double n1 = sc.nextDouble(); 
System.out.println ("Informe o segundo valor: ");  
		double n2 = sc.nextDouble(); 
if (n1 >= 0 && n2 >= 0 ) {
System.out.println ("Verdadeiro.");    
    }
else if (n1 < 0 && n2 < 0 ) {
System.out.println ("Falso.");    
    }
else {
    System.out.println ("Os números informados tem tipos de valores diferentes."); 
}
}
}
