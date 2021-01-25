package academy.learnprogramming;

public class Gamer {
    public void jugar(Consola deVideo) {
        System.out.println("La potencia de la consola es de " + deVideo.getPotencia());
    }
    public static void romper(IRompible rompible) {
        rompible.romper();
    }

}
