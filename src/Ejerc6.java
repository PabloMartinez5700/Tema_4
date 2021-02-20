/*
Crea una función que calcule la potencia x elevado a y. Utiliza esta función en un main.
 */

import java.util.Scanner;

public class Ejerc6 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int base, exponet;
        System.out.print("Introduzca la base: ");
        base = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el exponente: ");
        exponet = Integer.parseInt(s.nextLine());
        System.out.println("----------------------");
        System.out.println("Resultado de " + base + "^" + exponet + ":" + " " + calcularPotencia(base, exponet));
    }

    public static int calcularPotencia(int base, int exponente) {
        int numAux = 1;
        for (int i = 0; i < exponente; i++) {
            if (exponente == 0) { numAux = 1; }
            numAux *= base;
        }
        return numAux;
    }
}
