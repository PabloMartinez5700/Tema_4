/*
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii
entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un carácter.
 */

public class Ejerc18 {
    public static void main(String[] args) {
        int num;
     do {
         num = (int) ((Math.random() * 127));
     }while (num < 32);
    }
}
