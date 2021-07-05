/* Jailson é dono de um cinema com duas salas. 
A sala Alpha possui 140 lugares divididos em 6 fileiras (A, B, C, D, E, F) com mais 12 assentos para
 pessoas com deficiência. 
 A sala Beta possui 120 lugares divididos em 5 fileiras (A, B, C, D, E) com mais 6 lugares para pessoas
com deficiência. 
Haverá uma sessão na Sala Alpha de "As Branquelas" e outra sessão na Sala Beta de "A Chegada". 
Construa um programa em que uma pessoa compre um ingresso para qualquer uma das salas e possa escolher a 
fileira em que vai sentar. O programa deve perguntar, em algum momento, o nome do usuário. Uma vez que o 
assento seja escolhido, é necessário que o programa exiba quantos lugares ainda estão disponíveis no total 
e também em quais fileiras. É importante que o comprador possa escolher a quantidade de ingressos que quer
comprar e que ele não possa comprar mais ingressos do que a fileira tenha disponível. Ao final, o 
programa deve exibir a mensagem "[COMPRADOR], seus ingressos foram comprados com sucesso. 
Aproveite a pipoca grátis e tenha um bom filme.". (11/06/2021) */

import java.util.*;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String> lugares = new ArrayList <String>();
		int sala = 0;
		int escolha = 0;
        int escolhaQuantidade = 0;
		int quantidadeLugares = 0;
		String lugarEscolhido = "";
		System.out.println ("Por favor, insira seu nome: ");
		String comprador = sc.nextLine();
		
		while (escolha == 0) {
			System.out.println ("Temos duas salas de cinema dispoíveis. \n1. Sala Alpha: As Branquelas. \n2. Sala Beta: A chegada");
			sala = sc.nextInt();
			if (sala == 1 || sala == 2) {
				escolha += 1;
			} 
            else {
				System.out.println ("Opção inválida. Por favor, tente novamente.");
			}
		}

		while (escolhaQuantidade == 0) {
			if (sala == 1) {
				System.out.println ("A sala Alpha possuí 140 assentos disponiveis. Quantos assentos deseja adquirir?");
				quantidadeLugares = sc.nextInt();
				if (quantidadeLugares > 0 && quantidadeLugares <= 140) {
					escolhaQuantidade += 1;
				} 
                else {
					System.out.println("Por favor, selecione no máximo 140 ingressos.");
				}
			} else if (sala == 2) {
				System.out.println ("A sala Beta possuí 120 assentos disponiveis. Quantos assentos deseja adquirir?");
				quantidadeLugares = sc.nextInt();
				if (quantidadeLugares > 0 && quantidadeLugares <= 120) {
					escolhaQuantidade += 1;
				} 
                else {
					System.out.println ("Por favor, selecione no máximo 120 ingressos.");
				}
			}
		}

		for (int cont = 0; cont < quantidadeLugares; cont++) {
			if (sala == 1) {
				System.out.println ("Em qual fileira deseja sentar?" + "\nF " + "\nE " + "\nD" + "\nC" + "\nB"
						+ "\nA - Preferencial");
				char fileiraEscolhida = sc.next().charAt(0);
				sc.nextLine();
				fileiraEscolhida = Character.toLowerCase(fileiraEscolhida);
				if (fileiraEscolhida != 'a') {
					System.out.println ("Agora escolha um assento: " + "\n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 15 - 16 - 17 - 18 - 19 - 20 - 21 - 22 - 23");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();
				} 
                else {
					System.out.println ("Agora escolha um assento: " + "\n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();
				}
			} else if (sala == 2){
				System.out.println ("Qual fileira irá querer?" + "\nE " + "\nD" + "\nC" + "\nB"
						+ "\nA - Preferencial");
				char fileiraEscolhida = sc.next().charAt(0);
				fileiraEscolhida = Character.toLowerCase(fileiraEscolhida);
				if (fileiraEscolhida != 'a') {
					sc.nextLine();
					System.out.println ("Agora escolha um assento: \n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 15 - 16 - 17 - 18 - 19 - 20 - 21 - 22 - 23 - 24.");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();
				} 
                else {
					sc.nextLine();
					System.out.println("Agora escolha um assento: \n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 15 - 16 - 17 - 18. \nPreferencial: 19 20 21 22 23 24.");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();
				}
			}

			if (cont != 0) {
				if (!lugares.contains (lugarEscolhido)) 
                {
					lugares.add (cont, lugarEscolhido);
				} 
                else {
					System.out.println ("Esse lugar já está ocupado. Por favor, escolha outro.");
					cont -= 1;
				}
			} 
            else {
				lugares.add(cont, lugarEscolhido);
			}
		}
		System.out.println ("Operação realizada com sucesso.");
        System.out.println ("Tenha um bom filme, " + comprador + "!");
		sc.close();
	}
}