import java.util.*; 

/*O programa está cheio de erros. Encontre-os. */

public class Base {
	public static void main(String[] args) {  
	
		Scanner sc = new Scanner(System.in); 
		sc.useLocale(Locale.US);
		
		System.out.println("Caixa Eletronico em Java.");
		System.out.print("\nInforme o seu nome. ");  
		String nome = sc.nextLine(); 

		int tentativas = 3;
		double saldo = 999.12;
		
		while (tentativas > 0) { 

			System.out.print("\nInforme sua senha: ");  
			int senha = sc.nextInt();  
			
			if (senha == 1234) { 
			
				System.out.print ("Escolha uma das opções:\n1. Saldo.\n2. Saque.\n3. Depósito.\n4. Sair.");
				try {
					
					System.out.print ("\nEscolha uma opção: ");	
					int opcao = sc.nextInt(); 	

					if (opcao == 1) { 
						System.out.print ("\nSeu saldo é de: R$ " + saldo);
					} 
					else if (opcao == 2) { 

						System.out.print ("\nSeu saldo é de: R$" + saldo);
						System.out.print ("\nInforme o valor para retirada: ");
						double retirada = sc.nextDouble();
						
						if (retirada > 0 && retirada <= saldo) {
							saldo = saldo - retirada;
							System.out.print("\nSaque realizado com sucesso.");
							System.out.print("\nDepois da retirada, o saldo na sua conta é de: " + saldo);
						} 
						else if (retirada > saldo){
							System.out.print ("\nNão há saldo suficiente na conta para esse saque. Por favor, informe outro valor.");
						} 
						else {
							System.out.print("\nSua conta não foi movimentada.");
						}	
					} 
					else if (opcao == 3) { 
						System.out.print ("\nPor favor, informe o valor para deposito: ");
						double deposito = sc.nextDouble(); 
						saldo = saldo + deposito;
						System.out.print("\nDepósito realizado com sucesso.");
						System.out.print ("\nDepois do depósito, seu saldo é de: R$ " + saldo);
						
					} else if (opcao == 4) {
						System.out.print("\nObrigado por utilizar o nosso banco, " + nome + "!");
						System.exit(0); 
					} 
					else {
						System.out.print ("\nOpção inválida. Selecione entre 1, 2, 3 e 4. ");
					}
				} 
				catch (Exception e) {
				  System.out.print ("Houve um erro. Por favor, escolha uma opcao entre 1, 2, 3 e 4.");
				  System.exit(0);
				}
			} else {
				System.out.print("Senha inválida.\n");
				tentativas = tentativas - 1;
				if (tentativas > 0) {
					System.out.print ("\nVocê ainda possui "+ tentativas +" tentativa(s) para colocar sua senha correta.");
				} 
				else {
					System.out.print ("\nMuitas tentativas incorretas. Seu acesso foi bloqueado.");
					System.out.print ("\nPor favor, entre em contado com o seu gerente.");
					sc.close();
				}
			}
		}
		 System.exit(0);
		}
	}	
	
/* 0. Há alguns erros no código que impedem a execução ou não informam os valores corretos ao usuário. É hora de pegá-los. 
R: Feito. 7 erros encontrados. 

1. Quando o usuário informar que um valor para saque seja igual ao valor do saldo em conta, não é possível sacar. 
Qual o erro e como corrigir?
R: Na opção de saque, existia uma condição de que o valor de retirada deveria ser menor que o valor do saldo.
Corrigimos isso por alterar essa condição, na linha 38, para que o valor da retirada possa ser menor ou igual.
Antes: if (retirada > 0 && retirada < saldo) {
Corrigido: if (retirada > 0 && retirada <= saldo) {

2. Ao usuário informar que um valor para depósito o código não está funcionando corretamente. Qual o erro? E como corrigir? 
R: O erro é que o programa subtraia a quantidade do saldo, ao invés de adicionar. Corrigimos essa conta na linha 53.
Antes: saldo = saldo - deposito;
Corrigido: saldo = saldo + deposito;

3. Quando houver um saque, é necessário informar "Saque realizado com sucesso". 
R: Adicionado na linha 40. 
System.out.print ("\nSaque realizado com sucesso.");

4. Quando houver um depósito, é necessário informar "Depósito realizado com sucesso". 
R: Adicionado na linha 54. 
System.out.print ("\nDepósito realizado com sucesso.");

5. Altere o código para incluir o nome do usuário no começo da interação (antes mesmo de solicitar a senha). 
A Mensagem de despedida deve conter o nome do usuário. 
R: Adicionado na linha 10. 
	System.out.print("\nInforme o seu nome. ");  
	String nome = sc.nextLine();
   E adicionado na linha 58.
	System.out.print("\nObrigado por utilizar o nosso banco, " + nome + "!");*/