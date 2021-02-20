/*
Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine
de generar números hasta que no saque el 24. El programa deberá decir al final cuántos números
se han generado.
 */

public class Ejerc15 {
    public static void main(String[] args) {
        int contNum = 0;

        while (generarNumerosPares() != 24) {
            System.out.println(generarNumerosPares());
        }
        System.out.println();
        System.out.println("Números Generados: " + contNum);
    }


    public static int generarNumerosPares() {
        int contpares = 0;
        int numAzar = (int) ((Math.random() * 101));
        if (numAzar % 2 == 0){
            System.out.print(" " + numAzar);
            contpares++;
        }
        return contpares;
    }
}
