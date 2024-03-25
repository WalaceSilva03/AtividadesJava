public class Main {
    public static void main(String[] args) 
    {
        Telefone t = new Telefone("13","123456789");
        Cliente c = new Cliente("12345678900", "walace", t);

        c.mostrarDados();
        c.adicionarNumero("14", "223456789");
    }
}
