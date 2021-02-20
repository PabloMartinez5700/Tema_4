/*
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total
(los puntos que suman entre los tres dados).
 */

public class Ejerc8 {
    public static void main(String[] args) {
        int dado1 = tirada();
        System.out.println("Dado 1: " + dado1);
        int dado2 = tirada();
        System.out.println("Dado 2: " + dado2);
        int dado3 = tirada();
        System.out.println("Dado 3: " + dado3);
        System.out.println("-----------------------------------");
        System.out.println("Suma total: " + sumarPuntos(dado1,dado2,dado3));

    }

    public static int tirada (){ return (int) ((Math.random() * 6) + 1); }

    public static float sumarPuntos(int dado1, int dado2, int dado3){ return (dado1 + dado2 + dado3); }
}
