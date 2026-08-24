public class Utilizador {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo estado da TV -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo estado da TV -> A TV está ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume da TV: " + smartTv.volume);

        smartTv.mudarCanal(19);
        System.out.println("Novo canal da TV: " + smartTv.canal);
    }
}
