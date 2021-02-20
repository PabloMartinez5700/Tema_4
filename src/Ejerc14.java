/*
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas).
 */
public class Ejerc14 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("\t\t\t\t\t\tQUINIELA");
        System.out.println("\t================================================");

        // Pinto las Columnas
        for (int j = 1; j < 4; j++) {
            System.out.print("\t\tColumna " + j);
        }
        System.out.println("\n" + "\t================================================");

        //Pinto las 15 Filas
        for (int i = 1; i < 15; i++) {
            System.out.print("Fila " + i);

            // Pinto tiradas
            for (int l = 0; l < 3; l++) {
                System.out.print("\t\t" + tirada() + "\t\t");
            }
            System.out.println();
            System.out.println("---------------------------------------------------");
        }

        for (int k = 1; k < 4; k++){
            System.out.println("Pleno 15: Jugada " + k + "\n\tGoles Equip 1: " + pleno15() + "\n\tGoles Equip 2: " + pleno15() );
        }
    }

    public static String tirada() {
        int opcion = (int) ((Math.random() * 3));
        String tirada = "";
        switch (opcion) {
            case 0:
                tirada = "X";
                break;
            case 1:
                tirada = "1";
                break;
            case 2:
                tirada = "2";
                break;
        }
        return tirada;
    }

    public static String pleno15() {
        int opcion = (int) ((Math.random() * 4));
        String tirada = "";
        switch (opcion) {
            case 0:
                tirada = "0";
                break;
            case 1:
                tirada = "1";
                break;
            case 2:
                tirada = "2";
                break;
            case 3:
                tirada = "M+";
                break;
        }
        return tirada;
    }


}
