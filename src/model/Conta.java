package model;

public class Conta {

	protected String numeroConta = "";
	protected double saldo = 0.0;
	protected Banco banco = new Banco("", "");
	protected Cliente cliente = new Cliente("", "", saldo);


	public Conta(String numeroConta, double saldo, Banco banco, Cliente cliente) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.banco = banco;
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", banco=" + banco + ", cliente=" + cliente
				+ "]";
	}
	
}
