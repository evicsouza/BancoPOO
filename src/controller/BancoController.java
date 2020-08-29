package controller;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaPoupanca;

public class BancoController {

	public void cadastrarContaCorrente(String numero, double saldo, Banco banco, Cliente cliente ) {
		Conta conta = new Conta(numero, saldo, banco, cliente);
		Banco.addConta(conta);

	}

	public void cadastrarContaPoupanca(String numero, double saldo, Banco banco, Cliente cliente) {
		ContaPoupanca contaP = new ContaPoupanca(numero, saldo, banco, cliente);
		Banco.criarContaPoupanca(contaP);
	}

	public void realizarDeposito(String cpf, double valor) {
		Cliente cliente;
		for (Conta conta : Banco.getContas() ) {
			if(Banco.getContas().toString().contains(cpf)) {
				for (Conta element : Banco.getContas()) {
					cliente = element.getCliente();
					double novoValor = cliente.getSaldo()+valor;;
					cliente.setSaldo(novoValor);
					break;
				}
				System.out.println("Deposito realizado com sucesso!");
			}else {
				if(Banco.getContasPopanca().toString().contains(cpf)) {
					for (ContaPoupanca element : Banco.getContasPopanca()) {
						cliente = element.getCliente();
						double novoValor = cliente.getSaldo()+valor;;
						cliente.setSaldo(novoValor);					
						break;
					}
					System.out.println("Deposito realizado com sucesso!");
				}
				else {
					System.out.println("O cliente não foi localizado");
				}
			}

		}
	}
	public void renderJuros(String cpf) {
		Cliente cliente;
		if(Banco.getContasPopanca().toString().contains(cpf)) {
			for (int i = 0; i < Banco.getContasPopanca().size(); i++) {
				cliente = Banco.getContasPopanca().get(i).getCliente();
				ContaPoupanca.renderJuros(cliente);
				break;
			}
		}
		else {
			System.out.println("O cliente não foi localizado");
		}

	}
	public String consultarAgencia(String cpf) {
		for (Conta element : Banco.getContas()) {
			if(element.getCliente().getCpf().contains(cpf)) {
				System.out.println("O cliente " + element.getCliente().toString() + "possui conta "
						+ element.getBanco().toString());
			}else {
				System.out.println("CPF inválido!");
			}

		}
		return "";
	}

	public void alterarAgencia(String nome, String numeroAgencia, String nomeAgencia) {
		for (Conta element : Banco.getContas()) {
			if(element.getCliente().getNome().contains(nome)) {
				element.getBanco().setNumeroAgencia(numeroAgencia);
				element.getBanco().setNomeAgencia(nomeAgencia);
				System.out.println("Alterado com sucesso");
			}else {
				System.out.println("CPF inválido");
			}
		}
	}
}
