/*
Escribe un programa que pase de decimal a binario. Realízalo llamando a una función.
 */


import java.util.Scanner;

public class Ejerc3 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int num;
        System.out.println();
        System.out.print("Introduzca un numero: ");
        num = Integer.parseInt(s.nextLine());
        System.out.println(decimalABinario(num));
    }

    public static String decimalABinario(int num) {
        String numBinario = "";
        while (num > 0) {
            numBinario = (num % 2 == 0) ? "0" + numBinario : "1" + numBinario;
            num /= 2;
        }
        return numBinario;
    }
}
