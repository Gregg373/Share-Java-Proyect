package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        System.out.println("Array de colores Xbox " + Xbox.seriesX());

        Playstation p = new Playstation();
        p.romper();


        Xbox s = new Xbox();
        s.romper();

        Gamer gamer = new Gamer();
        gamer.jugar(p);
        gamer.jugar(s);
        

    }
}

