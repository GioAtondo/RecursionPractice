/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Giovanni
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        if(numerosPrimos(2,2)){
           System.out.println("Si es primo");
       }
       else{
           System.out.println("No es primo");
       }
        
    }

    // Metodo que regresa una cadena con la serie de numeros de N a 0
    public static String numeros(int n) {
        if (n == 0) {
            return "0";
        } else {
            return n + "" + numeros(n - 1);
        }
    }

    // Metodo que regresa una cadena con la serie de numeros de 0 a N
    public static String numerosalrevez(int n) {
        if (n == 0) {
            return "0";
        } else {
            return  numerosalrevez(n - 1) + n;
        }
    }

    // Metodo que regresa el valor de elevar n a la x potencia. n^x
    public static int potencia(int n, int x) {
        if (x == 0) {
            return 1;
        } else {
            return n * potencia(n, x - 1);
        }
    }

    // Metodo que regresa el calculo de la multiplicacion de 2 numeros con sumas sucesivas
    public static int multiplicacion(int n, int a) {
        if (a == 1) {
            return n;
        } else {
            return n + multiplicacion(n, a - 1);
        }
    }

    // Metodo que calcula la suma de valores de un arreglo de n numeros.
    public static int arreglo(int a[], int p) {
        
        if (p == 0) {
            return a[p];
        } else {
            return a[p] + arreglo(a, p - 1);
        }
    }

    // Metodo que calcule la serie 1/n^2+1/(n-1)^2
    public static String serie(int n) {
        if (n == 0) {
            return "0";
        } else {
            return "1/" + n + "^2" + serie(n - 1);
        }
    }

    // Metodo que reciba un numero y regrese una cadena con los n valores de la serie de Fibonacci
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    // Método que identifique si el número de entrada es un número primo o no.

    public static boolean numerosPrimos(int numero, int c) {
        if (numero % c == 0 && numero != 2) {
            return false;
        } else {
            if (c > numero / 2) {
                return true;
            } else {
                return numerosPrimos(numero, c + 1);
            }
        }
    }
}
