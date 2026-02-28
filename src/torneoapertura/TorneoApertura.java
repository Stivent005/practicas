package torneoapertura;

import java.util.Scanner;

/**
 *
 * @author stivent
 */
public class TorneoApertura {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        int ganados;
        int empatados;
        int perdidos;
        int puntos;

        System.out.print("Partidos ganados: ");
        ganados = datos.nextInt();

        System.out.print("Partidos empatados: ");
        empatados = datos.nextInt();

        System.out.print("Partidos perdidos: ");
        perdidos = datos.nextInt();

        puntos = (ganados * 3) + (empatados * 1) + (perdidos * 0);

        System.out.println("Puntaje total: " + puntos);
    }
}