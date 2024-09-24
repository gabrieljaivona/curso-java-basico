import apps.FacebookMessenger;
import apps.ServicoDeMensagem;
import apps.TelegramMessenger;
import apps.WhatsappMessenger;

public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        ServicoDeMensagem smi = null;

        String appEscolhido  = "tlg";

        if(appEscolhido.equals("msm"))
            smi = new WhatsappMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}