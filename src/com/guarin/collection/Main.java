package com.guarin.collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Guapo");

        Test1I a = new Test1I();
        Test1I h = new Test1I();
        Test1I j = new Test1I();
        Test1I i = new Test1I();

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int primerValor = consola.nextInt();
        System.out.println("Ingrese el segundo valor");
        int segundoValor = consola.nextInt();

        int resultado = Test1I.sumar(primerValor, segundoValor);
        System.out.println("El resultado es = " + resultado);


    }

    {
        System.out.println("hola clase main");
    }

}
