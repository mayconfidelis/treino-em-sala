package org.example;

/**
 * Hello world!
 *
 */
public class App {

    public static int soma (int a, int b){
        return a + b;
    }
    public static void main( String[] args) {

        int resultado = soma (10, 12);
        System.out.println("A soma dos dois números é: " + resultado);
    }
}
