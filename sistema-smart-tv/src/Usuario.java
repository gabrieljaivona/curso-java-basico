public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual : " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.passarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
