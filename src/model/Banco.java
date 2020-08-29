package model;

import java.util.ArrayList;

public class Banco {

	protected String numeroAgencia = "";
	protected String nomeAgencia = "";
	protected static ArrayList<Conta> contas = new ArrayList<>();
	protected static ArrayList<ContaPoupanca> contasPopanca = new ArrayList<>();



	public Banco(String numeroAgencia, String nomeAgencia) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.nomeAgencia = nomeAgencia;
	}
	
	
	public String toString() {
		return "Banco [numeroAgencia=" + numeroAgencia + ", nomeAgencia=" + nomeAgencia + "]";
	}


	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public static ArrayList<Conta> getContas() {
		return contas;
	}
	public static void setContas(ArrayList<Conta> contas) {
		Banco.contas = contas;
	}
	public static ArrayList<ContaPoupanca> getContasPopanca() {
		return contasPopanca;
	}
	public static void setContasPopanca(ArrayList<ContaPoupanca> contasPopanca) {
		Banco.contasPopanca = contasPopanca;
	}

	public static void addConta(Conta conta) {
		contas.add(conta);
	}
	public static void criarContaPoupanca(ContaPoupanca contaP) {
		contasPopanca.add(contaP);
	}

}
