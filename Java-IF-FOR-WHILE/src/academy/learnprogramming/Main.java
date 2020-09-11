package academy.learnprogramming;

import java.util.Scanner;

public class Main {



    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.println("Por favor ingresar un numero");
            String primerValor = scanner.nextLine().toLowerCase();
            System.out.println("Por favor ingresar otro numero");
            String segundoValor = scanner.nextLine().toLowerCase();


        System.out.println(primerValor);
        System.out.println(segundoValor);

        int primerNumero = Integer.parseInt(primerValor);
        int segundoNumero = Integer.parseInt(segundoValor);

        int mayor;
        int menor;

    boolean condicion = primerNumero < segundoNumero;
        if (condicion) {
            System.out.println(segundoValor + " es mayor que " + primerValor);
            mayor = segundoNumero;
            menor = primerNumero;
        } else {
            System.out.println(primerValor + " es mayor que " + segundoValor);
            mayor = primerNumero;
            menor = segundoNumero;
        }
        for (int i = 0; i < mayor; i++) {
            System.out.println("soy el mayor");
        }
    int xb = 0;
        while (xb < menor) {
            System.out.println("soy el menor");
            xb++;
        }
        scanner.close();
    }

}