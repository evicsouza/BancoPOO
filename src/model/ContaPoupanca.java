package model;

public class ContaPoupanca extends Conta {

	protected static double juros;

	public ContaPoupanca(String numeroConta, double saldo, Banco banco, Cliente cliente) {
		super(numeroConta, saldo, banco, cliente);
	}

	public static double renderJuros(Cliente cliente) {
		juros = cliente.saldo*0.10;
		return juros;
	}



}
