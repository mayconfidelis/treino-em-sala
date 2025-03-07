package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static long calcularFatorial (int numero){
       if (numero <0) {
           throw new IllegalArgumentException("O número deve ser positivo.");
       }
        long fatorial = 1;
       for (int i = 2; i <= numero; i++) {
           fatorial *= i;
       }
       return fatorial;
    }
    public static void main( String[] args ) {

        int numero = 5;
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);


    }
}
