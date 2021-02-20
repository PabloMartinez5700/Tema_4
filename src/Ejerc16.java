/*
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el
que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las
líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 */

public class Ejerc16 {
    public static void main(String[] args) {
        int longit, caracter;
        String relleno = "";

        for(int i = 1; i < 11; i++) {
            longit = (int)(Math.random() * 40) + 1;
            caracter = (int)(Math.random() * 6);
            switch(caracter) {
                case 0:
                    relleno = "*";
                    break;
                case 1:
                    relleno = "-";
                    break;
                case 2:
                    relleno = "=";
                    break;
                case 3:
                    relleno = ".";
                    break;
                case 4:
                    relleno = "|";
                    break;
                case 5: relleno = "@";
            }

            for(int j = 1; j <= longit; j++) { System.out.print(relleno); }
            System.out.println();
        }
    }
}
