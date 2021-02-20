/*
Codifica una función que reciba los valores necesarios para calcular el área de un triángulo. Usa
está función en un main.
 */

import java.util.Scanner;

public class Ejerc5 {
    public static void main(String[] args) {
        int alt, base;
        System.out.println();
        alt = pedirDatos("Altura");
        base = pedirDatos("Base");
        System.out.println("ÁREA: " + calcularTrianguloArea(alt, base));
    }

    public static float calcularTrianguloArea(int base, int alt) {
        return (float) (base * alt) / 2;
    }

    public static int pedirDatos(String opcion) {
        var s = new Scanner(System.in);
        System.out.print("Introduzca el valor de la " + opcion + ": ");
        return Integer.parseInt(s.nextLine());
    }
}
