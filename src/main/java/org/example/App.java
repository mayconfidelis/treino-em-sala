package org.example;

/**
 * Hello world!
 *
 */
public class App {

    public static String parImpar (int numero){
        if (numero%2==0){
            return "Par";
        } else {
            return "Impar";
        }
    }

    public static void main( String[] args ) {
        int numero = 7;

        String resultado = parImpar(numero);

        System.out.println("O número " + numero + " é " + resultado);
    }
}
