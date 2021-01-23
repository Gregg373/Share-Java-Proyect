package academy.learnprogramming;

public  class Playstation extends Consola implements IRompible {
    private int credito;

//    @Override
    public void romper() {
        setPotencia(0);
            System.out.println("Me rompieron y soy una Playstation con una potencia de = " + getPotencia());

        }

    }



