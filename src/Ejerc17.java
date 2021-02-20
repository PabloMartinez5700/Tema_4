/*
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
suspensos, el número de suficientes, el número de bienes, etc.
 */

public class Ejerc17 {
    public static void main(String[] args) {
        System.out.println("Suspensos, " + generarNota() + " Suficientes, " + generarNota() + " Bienes, " + generarNota() + " Notables, " + generarNota() + " Sobresalientes, " + generarNota());
    }

    public static int generarNota (){
        int nota = 0, contSuspensos = 0, contSufi = 0, contBien = 0, contNotable = 0, contSobre = 0;
        for (int i = 0; i < 21; i++) {
            nota = (int) ((Math.random() * 10) + 1);
            switch (nota) {
                case 0, 1, 2, 3, 4:
                    System.out.println("Suspenso: " + nota);
                    contSuspensos++;
                    break;
                case 5:
                    System.out.println("Suficiente: " + nota);
                    contSufi++;
                    break;
                case 6:
                    System.out.println("Bien: " + nota);
                    contBien++;
                    break;
                case 7, 8:
                    System.out.println("Notable: " + nota);
                    contNotable++;
                    break;
                case 9, 10:
                    System.out.println("Sobresaliente: " + nota);
                    contSobre++;
            }
        }
        System.out.println("-----------------------------------------------------------------------");
        return nota;
    }
}

