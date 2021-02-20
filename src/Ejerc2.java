/*
Escribe un programa que pase de binario a decimal. Realízalo llamando a una función.
 */

import java.util.Scanner;

public class Ejerc2 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un numero: ");
        num = Integer.parseInt(s.nextLine());
        System.out.println(decimal(num));

    }


    public static double decimal(int x) {
        int resto, copia;
        double num, numdecimal = 0;
        int longitud = longuitudNum(x);
        copia = x;
        for (int y = 0; y <= longitud; y++) {
            resto = copia % 10;
            copia /= 10;
            num = resto * Math.pow(2, y);
            numdecimal += num;
        }
        return numdecimal;
    }

    public static int longuitudNum(int num) {
        int numAux, longitud = 0;
        numAux = num;
        while (numAux > 0) {
            numAux /= 10;
            longitud++;
        }
        return longitud;
    }
}
