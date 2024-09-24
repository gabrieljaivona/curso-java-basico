package apps;

public class WhatsappMessenger extends ServicoDeMensagem {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Whatsapp");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Whatsapp");
    }
}
