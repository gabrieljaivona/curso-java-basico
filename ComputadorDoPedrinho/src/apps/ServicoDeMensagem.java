package apps;

public abstract class ServicoDeMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem este metodo
    protected void validarConectadoInternet(){
        System.out.println("Validando se eatá conectado a internet");
    }
}
