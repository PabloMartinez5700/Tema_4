/*
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
Muestra también el máximo, el mínimo y la media de esos números.
 */
public class Ejerc12 {
    public static void main(String[] args) {
        float media, sumaTotal = 0;
        int maximo = 0, minimo = 0, numAzar;
        for (int i = 0; i < 51; i++) {
            numAzar = (int) ((Math.random() * (199 - 100) + 100));
            System.out.print(" " + numAzar);
            sumaTotal += numAzar;
            if (numAzar > maximo) maximo = numAzar;
            else if (numAzar < maximo) minimo = numAzar;
        }
        System.out.println();
        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        media = sumaTotal / 50;
        System.out.println("Media: " + media);
    }
}
