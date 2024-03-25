package entities;

public class Cliente {
	
	private String nome;
	private double saldo;
	private double limite;
	
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public void Saque (double valorSaque) {
		if((saldo + limite) > valorSaque) {
			saldo -= valorSaque;
		}else {
			System.out.println("Você não tem limite para sacar essa quantia.");
		}
	}
	
	public void depositar (double valorDeposito) {
			saldo += valorDeposito;
	}
	
	public double checarSaldo() {
		return saldo + limite;
	}
	
	public String obterNome() {
		return nome;
	}
	
	

}