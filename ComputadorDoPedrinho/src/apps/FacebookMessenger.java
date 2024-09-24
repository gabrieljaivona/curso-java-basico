package apps;

//extends == herança
public class FacebookMessenger extends ServicoDeMensagem {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
