public class Main {

    public static void main(String[] args) {
        Lampada l = new Lampada(ESTADO.APAGADA);

        for(int i = 0; i < 10; i++)
        {
            l.click();
            if(i % 2 == 0) //Quando i for um número par, aciona o método checaEstado, assim não spama a tela.
            {
                l.checaEstado();
            }
        }

    }

}
