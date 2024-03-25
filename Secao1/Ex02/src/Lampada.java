public class Lampada {
    private int acendimentos;
    private ESTADO estado;

    public Lampada(ESTADO estado)
    {
        this.estado = estado;
    }


    public void click()
    {
        if(estado == ESTADO.ACESA)
        {
            estado=APAGADA;
        }
        else
        {
            estado=ACESA;
            qtdAcendimentos();
        }
    }

    private void qtdAcendimentos(){
        acendimentos++;
    }

    public void checaEstado()
    {
        System.out.print("A lâmpada está: " + estado);
        System.out.print("Foi acesa " + acendimentos + " vezes.");
    }
}
