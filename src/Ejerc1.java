/*
Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones.
Recuerda que puedes usar unas dentro de otras si es necesario.
1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
y falso en caso contrario.
2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y
falso en caso contrario.
3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.
5. digitos: Cuenta el número de dígitos de un número entero.
6. voltea: Le da la vuelta a un número.
7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
empieza contando por el 0 y de izquierda a derecha.
8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de
un número entero. Si no se encuentra, devuelve -1.
9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
11. pegaPorDetras: Añade un dígito a un número por detrás.
12. pegaPorDelante: Añade un dígito a un número por delante.
13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un
número y devuelve el trozo correspondiente.
14. juntaNumeros: Pega dos números para formar uno.
Crea un menú parar usar estas funciones y llama a cada función en según la opción elegida.
 */

import com.sun.jdi.Value;

import java.util.Scanner;

public class Ejerc1 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int opcion, num, base, exponent, pos,num2;
        String num3,num4;
        boolean salir = false;

        do {
            System.out.println();
            System.out.println("\tFUNCIONES MATEMÁTICAS");
            System.out.println("===============================================");
            System.out.println("1. ¿Es Capicua?.");
            System.out.println("2. ¿Es Primo?.");
            System.out.println("3. Siguiente Primo.");
            System.out.println("4. Potencia.");
            System.out.println("5. Digitos.");
            System.out.println("6. Voltea Numero.");
            System.out.println("7. Posición Digito.");
            System.out.println("8. Posicion De Digito.");
            System.out.println("9. Quita Por Detras.");
            System.out.println("10. Quita Por Delante.");
            System.out.println("11. Pega Por Detras.");
            System.out.println("12. Pega Por Delante.");
            System.out.println("13. Trozo De Numero.");
            System.out.println("14. Junta Numeros.");
            System.out.println("15. Salir");
            System.out.println("===============================================");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num = Integer.parseInt(s.nextLine());
                    System.out.println((esCapicua(num) ? "El numero introducido " + num + " es Capicua." : "El numero introducido " + num + " no es Capicua."));
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num = Integer.parseInt(s.nextLine());
                    System.out.println((esPrimo(num) ? "El numero introducido " + num + " es Primo." : "El numero introducido " + num + " no es Primo."));
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num = Integer.parseInt(s.nextLine());
                    System.out.println((siguientePrimo(num)));
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Introduzca la base: ");
                    base = Integer.parseInt(s.nextLine());
                    System.out.print("Introduzca el exponente: ");
                    exponent = Integer.parseInt(s.nextLine());
                    System.out.println(potenciaAux(base, exponent));
                    break;
                case 5:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num = Integer.parseInt(s.nextLine());
                    System.out.println("Tiene " + digitos(num) + " digitos.");
                    break;
                case 6:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num = Integer.parseInt(s.nextLine());
                    System.out.println(voltearNumero(num));
                    break;
                case 7:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num = Integer.parseInt(s.nextLine());
                    System.out.print("Introduzca la posicion: ");
                    pos = Integer.parseInt(s.nextLine());
                    System.out.println((digitoN(num, pos)));
                    break;
                case 8:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num = Integer.parseInt(s.nextLine());
                    System.out.println(quitarPorDetras(num));
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    System.out.println();
                    System.out.print("Introduzca su numero: ");
                    num3 = s.nextLine();
                    System.out.print("Introduzca su numero: ");
                    num4 = s.nextLine();
                    System.out.println(juntarNumero(num3,num4));
            }
        } while (salir);
    }

    public static boolean esCapicua(int num) {
        int cifra, inverso = 0, numAux;
        numAux = num;
        while (numAux > 0) {
            cifra = numAux % 10;
            inverso = inverso * 10 + cifra;
            numAux /= 10;
        }
        return true;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) return false;
        }
        return true;
    }

    public static int siguientePrimo(int num) {
        num++;
        while (!esPrimo(num)) num++;
        return num;
    }

    public static float potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }

    public static int potenciaAux(int base, int exponente) {
        int numuAux = 1;
        for (int i = 0; i < exponente; i++) {
            numuAux = numuAux * base;
        }
        return numuAux;
    }

    public static int digitos(int num) {
        int numAux, longuitud = 0, digito = 0;
        numAux = num;

        while (numAux > 0) {
            numAux /= 10;
            longuitud++;
        }

        for (int i = (longuitud - 1); i >= 0; i--) {
            digito = (int) (num / Math.pow(10, i));
            num %= (int) Math.pow(10, i);
        }
        return digito;
    }

    public static int voltearNumero(int num) {
        int resto, numInvdertido = 0;
        while (num > 0) {
            resto = num % 10;
            numInvdertido = numInvdertido * 10 + resto;
            num /= 10;
        }
        return numInvdertido;
    }

    public static int digitoN(int num, int pos) {
        if (pos >= digitos(num)) return -1;
        return Integer.parseInt(String.valueOf(num).substring(pos, pos + 1));
    }

    public static int posicionDigito(int digit,int num){
        String numString = String.valueOf(num);
        for (int i = 0; i < digitos(num);i++){
            if (Integer.parseInt(numString.substring(i, i + 1)) == digit)return ++i;
        }
        return -1;
    }

    public static int quitarPorDetras (int num){
        return num / 10;
    }


    public static int quitaPorDelante (int num,int digit){
        if (digit > digitos(num)) return -1;
        int cifra = digitos(num) - digit;
        double result = num % Math.pow(10,cifra);
        return (int) result;
    }


    public static String juntarNumero (String num1, String num2){
        return num1.concat(num2);

    }


}
