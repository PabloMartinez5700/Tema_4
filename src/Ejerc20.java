/*
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 13. El programa
intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5
oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás
 */

public class Ejerc20 {
    public static void main(String[] args) {


    }


    public static int generarNum(){
        int numSecreto = (int) ((Math.random() * 101));
        return numSecreto;
    }
}
