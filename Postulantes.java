package postulantes;

import java.util.Scanner;

public class Postulantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int correctas;
        int incorrectas;
        int blancas;
        int puntaje;

        System.out.print("Ingrese el numero de respuestas correctas: ");
        correctas = scanner.nextInt();

        System.out.print("Ingrese el numero de respuestas incorrectas: ");
        incorrectas = scanner.nextInt();

        System.out.print("Ingrese el numero de respuestas dejadas en blanco: ");
        blancas = scanner.nextInt();

        puntaje = (correctas * 4) - incorrectas;

        System.out.println("El puntaje final es: " + puntaje);
    }
}