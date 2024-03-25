package entities;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Walace Jose Silva", 1000.50, 5000.00);
		Cliente c2 = new Cliente("Marcus Vinicius Matias", 5000.00, 2000.00);
		Transferencia t = new Transferencia();
		
		System.out.println(c1.obterNome());
		System.out.println(c1.checarSaldo());
		c1.depositar(1000.00);
		System.out.println(c1.checarSaldo());
		c1.Saque(1000.00);
		System.out.println(c1.checarSaldo());
		
		System.out.println();
		
		t.transferir(c1, c2, 100000.0);
		
		System.out.println(c1.checarSaldo());

	}

}
