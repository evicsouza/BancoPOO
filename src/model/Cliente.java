package model;

public class Cliente {

	protected String cpf;
	protected String nome;
	protected double saldo;





	public Cliente(String cpf, String nome, double saldo) {
		this.cpf = cpf;
		this.nome = nome;
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", saldo=" + saldo + "]";
	}


	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo;
	}
}
