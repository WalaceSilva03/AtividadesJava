package entities;

public class Transferencia {
	
	
	public void transferir(Cliente c1, Cliente c2, double quantia) {
		if(c2.checarSaldo() >= quantia) {
			c2.Saque(quantia);
			c1.depositar(quantia);
			System.out.println("Transferidos " + quantia + " da conta de " + c2.obterNome() + " para a conta de " + c1.obterNome());
		} else {
			System.out.println("Transferência não realizada, conta sem saldo");
		}
	}

}
