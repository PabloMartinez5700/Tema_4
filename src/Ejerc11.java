/*
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 */

public class Ejerc11 {
    public static void main(String[] args) {
        for (int i = 0; i < 21 ;i++){
            System.out.println("Numero " + i + ": " + (int) ((Math.random() * 11)));
        }
    }
}
