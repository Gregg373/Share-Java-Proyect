package academy.learnprogramming;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Por favor ingresar un numero");
        String primerValor = scanner.nextLine().toLowerCase();
        System.out.println("Por favor ingresar otro numero");
        String segundoValor = scanner.nextLine().toLowerCase();
        System.out.println("Por favor ingresar otro numero mas");
        String tercerValor = scanner.nextLine().toLowerCase();


        System.out.println(primerValor);
        System.out.println(segundoValor);
        System.out.println(tercerValor);


//        Integer.parseInt(
        int primerNumero = Integer.parseInt(primerValor);
        int segundoNumero = Integer.parseInt(segundoValor);
        int tercerNumero = Integer.parseInt(tercerValor);

        int mayor = 0;
        int menor = 0;
        int medio = 0;

    if (primerNumero > segundoNumero && primerNumero > tercerNumero && segundoNumero > tercerNumero){
        System.out.println(primerValor + " es mayor que " + segundoValor + " y que " + tercerValor);
        mayor = primerNumero;
        medio = segundoNumero;
        menor = tercerNumero;

    } else if (tercerNumero > segundoNumero && primerNumero > segundoNumero && primerNumero > tercerNumero) {
        System.out.println(primerValor + " es mayor que " + tercerValor + " y que " + segundoValor);
        mayor = primerNumero;
        medio = tercerNumero;
        menor = segundoNumero;

    } else if (segundoNumero > primerNumero && segundoNumero > tercerNumero && primerNumero > tercerNumero) {
        System.out.println(segundoValor + " es mayor que " + tercerValor + " y que " + primerValor);
        mayor = segundoNumero;
        medio = primerNumero;
        menor = tercerNumero;
    } else if (tercerNumero > primerNumero && segundoNumero > primerNumero && segundoNumero > tercerNumero) {
        System.out.println(segundoValor + " es mayor que " + primerValor + " y que " + tercerValor);
        mayor = segundoNumero;
        medio = tercerNumero;
        menor = primerNumero;

    } else if (tercerNumero > segundoNumero && tercerNumero > primerNumero && segundoNumero > primerNumero){
        System.out.println(tercerValor + " es mayor que " + segundoValor + " y que " + primerValor);
        mayor = tercerNumero;
        medio = segundoNumero;
        menor = primerNumero;

    } else if (primerNumero > segundoNumero && tercerNumero > segundoNumero && tercerNumero > primerNumero){
        System.out.println(tercerValor + " es mayor que " + primerValor + " y que " + segundoValor);
        mayor = tercerNumero;
        medio = primerNumero;
        menor = segundoNumero;

    }
    int n = 0;
        while (n < mayor) {
            System.out.println("soy el mayor");
            n++;
        }

    int m = 0;
        while (m < medio) {
            System.out.println("soy el del medio");
            m++;
        }
        int j = 0;
        while (j < menor) {
            System.out.println("soy el menor");
            j++;
        }


    }
}