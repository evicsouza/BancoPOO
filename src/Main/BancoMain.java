package Main;

import java.util.Locale;
import java.util.Scanner;

import controller.BancoController;
import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaPoupanca;

public class BancoMain {

	public static void menu() {
		System.out.println("O que você deseja fazer? Selecione uma opção " + "\n" +
				"1 - Cadastrar uma Conta Corrente ou uma Conta Poupança" + "\n" +
				"2 - Realizar um depósito" + "\n" +
				"3 - Render Juros" + "\n" + 
				"4 - Consultar número e nome da agência" + "\n" +
				"5 - Alterar o número e o nome da agênca" + "\n" +
				"0 - Sair" + "\n" );

	}
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		BancoController bancoC = new BancoController();
		int num = 0;

		//		Banco bancoTeste = new Banco("123", "abc");
		//		Cliente clienteTeste = new Cliente("1234567", "Eva", 2.000);
		//		bancoC.cadastrarContaPoupanca("123", 2.000, bancoTeste, clienteTeste);

		do {
			menu();
			num = sc.nextInt();
			sc.useLocale(Locale.US);
			if(num == 0) {
				break;
			}
			switch (num) {
			case 1:

				System.out.println("Que conta você deseja cadastrar? \n"
						+ "1 - Conta Corrente \n"
						+ "2 - Conta Poupança \n"
						+ "3 - Voltar ao menu anterior \n");
				int op = sc.nextInt();
				switch(op) {
				case 1:
					System.out.println("Por favor, informe o numero da conta \n");
					String numero = sc.next();
					System.out.println("Por favor, informe o saldo da conta \n");
					double saldo = sc.nextDouble();
					System.out.println("Por favor, informe o numero da agencia da conta \n");
					String agencia = sc.next();
					System.out.println("Por favor, informe o nome da agencia da conta \n");
					String nomeagencia = sc.next();
					System.out.println("Por favor, informe o CPF do titular conta ");
					String cpfCliente = sc.next();
					System.out.println("Por favor, informe o nome do titular da conta \n");
					String nomeCliente = sc.next();
					Banco banco = new Banco(agencia, nomeagencia);
					Cliente cliente = new Cliente(cpfCliente, nomeCliente, saldo);
					bancoC.cadastrarContaCorrente(numero, saldo, banco, cliente);
					System.out.println("Cliente cadastrado com sucesso!! \n");
					break;
				case 2:
					System.out.println("Por favor, informe o numero da conta \n");
					String numeroP = sc.next();
					System.out.println("Por favor, informe o saldo da conta \n");
					double saldoP = sc.nextDouble();
					System.out.println("Por favor, informe o numero da agencia da conta \n");
					String agenciaP = sc.next();
					System.out.println("Por favor, informe o nome da agencia da conta \n");
					String nomeagenciaP = sc.next();					
					System.out.println("Por favor, informe o CPF do titular conta \n");
					String cpfClienteP = sc.next();
					System.out.println("Por favor, informe o nome do titular da conta \n");
					String nomeClienteP = sc.next();
					Banco bancoP= new Banco(agenciaP, nomeagenciaP);
					Cliente clienteP = new Cliente(cpfClienteP, nomeClienteP, saldoP);
					bancoC.cadastrarContaPoupanca(numeroP, saldoP, bancoP, clienteP);
					System.out.println("Conta cadastrada com sucesso!! \n");					
					break;
				case 3:
					menu();
				default:
					System.out.println("Opção Inválida");
				}
				break;

			case 2:
				System.out.println("Informe o CPF do titular da conta de você deseja depositar");
				String cpf = sc.next();
				System.out.println("Informe o valor que você deseja depositar");
				double valor = sc.nextDouble();
				bancoC.realizarDeposito(cpf, valor);
				break;
			case 3:
				System.out.println("Informe o CPF do cliente");
				String cpfJuros = sc.next();
				bancoC.renderJuros(cpfJuros);
				break;
			case 4:
				System.out.println("Informe o CPF do cliente");
				String cpfConsulta = sc.next();
				bancoC.consultarAgencia(cpfConsulta);
				break;
			case 5:
				System.out.println("Informe o nome do cliente");
				String nomeAlt = sc.next();
				System.out.println("Informe o novo número da agencia");
				String numAgAlt = sc.next();
				System.out.println("Informe o novo nome da agencia");
				String nomeAgAlt = sc.next();
				bancoC.alterarAgencia(nomeAlt, numAgAlt, nomeAgAlt);
			default:
				System.out.println("Número inválido \n");
				menu();
			}
		}
		while(num != 0);
	}
}
