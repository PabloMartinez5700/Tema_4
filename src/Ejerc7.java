/*
Crea una función que devuelva verdadero o falso dependiendo de si el carácter que recibe es vocal
o consonante. Vocal = Verdadero, consonante = falso. Usa esta función en un main que va
pidiendo caracteres hasta que se introduce un número.
 */

import java.util.Scanner;

public class Ejerc7 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        String letra;
        boolean salir = false;

        do {
            System.out.print("Letra: ");
            letra = s.nextLine();
            if (letra.length() != 1) System.out.println("Fallo, al meter los datos.");
            else{
                System.out.println("La letra " + letra.toUpperCase() + (VocalOConsonante(letra) ? " es vocal." : " es consonante."));
            }
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") ||
                    letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("f") ||
                    letra.equalsIgnoreCase("g") || letra.equalsIgnoreCase("h") || letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("j") || letra.equalsIgnoreCase("k") || letra.equalsIgnoreCase("l") ||
                    letra.equalsIgnoreCase("m") || letra.equalsIgnoreCase("n") || letra.equalsIgnoreCase("ñ") ||
                    letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("p") || letra.equalsIgnoreCase("q") ||
                    letra.equalsIgnoreCase("r") || letra.equalsIgnoreCase("s") || letra.equalsIgnoreCase("t") ||
                    letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("w") || letra.equalsIgnoreCase("y") ||
                    letra.equalsIgnoreCase("z")) {
                salir = true;
            }
        } while (salir);
    }

    public static boolean VocalOConsonante(String letra) {
        boolean comprobacion =  letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("o");;
        return comprobacion;
    }
}
