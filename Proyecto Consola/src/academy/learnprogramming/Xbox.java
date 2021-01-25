package academy.learnprogramming;

import java.util.ArrayList;

public class Xbox extends Consola implements IRompible {

    public static ArrayList<String> seriesX() {

        ArrayList<String> color = new ArrayList<>();
        color.add("Verde");
        color.add("Rojo");
        color.add("Amarillo");
        color.add("Azul");
        color.add("Rosa");


        color.sort(String.CASE_INSENSITIVE_ORDER);
        return color;
    }

//    @Override
    public void romper() {
        setMemoria(0);
        System.out.println("Me rompieron y soy una Xbox con una memoria de = " + getMemoria());
    }
}
