public class Cliente {
    private String cpf, nome;
    private Telefone telefone;

    public Cliente(String cpf, String nome, Telefone telefone)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public void mostrarDados()
    {
        System.out.printIn("CPF: " + cpf);
        System.out.printIn("Nome: " + nome);
        System.out.printIn("Telefone: " + telefone.obterDDD() + telefone.obterNumero());
    }

    public Telefone adicionarNumero(String ddd, String numero) {      
        this.telefone = new Telefone(ddd, numero);
        System.out.println("Telefone (" + ddd + ") " + numero + " adicionado com sucesso...");
        return this.telefone;
    }
}
