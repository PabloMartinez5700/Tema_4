/*
Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J,
Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).
 */

public class Ejerc9 {
    public static void main(String[] args) {
        System.out.println("Numero de la carta: " + numeroCarta() + " ^" + " " + numeroPalo());
    }

    public static String numeroCarta() {
        int numCartas =  (int) ((Math.random() * 13));
        String carta = "";
        switch (numCartas){
            case 0:
                carta = "A";
                break;
            case 1:
                carta = "2";
                break;
            case 2:
                carta = "3";
                break;
            case 3:
                carta = "4";
                break;
            case 4:
                carta = "5";
                break;
            case 5:
                carta = "6";
                break;
            case 6:
                carta = "7";
                break;
            case 7:
                carta = "8";
                break;
            case 8:
                carta = "9";
                break;
            case 9:
                carta = "10";
                break;
            case 10:
                carta = "J";
                break;
            case 11:
                carta = "Q";
                break;
            case 12:
                carta = "K";
                break;
        }
        return carta;
    }

    public static String numeroPalo() {
        int opcion = (int) ((Math.random() * 3));
        String palo = "";
        switch (opcion) {
            case 0:
                palo = "Picas";
                break;
            case 1:
                palo = "Corazones";
                break;
            case 2:
                palo = "Diamantes";
                break;
            case 3:
                palo = "Tréboles";
                break;
        }
        return palo;
    }
}
