
import java.util.Scanner;

public class PC_E2 {

    static double promedio(double primeraNota, double segundaNota,
                           double terceraNota) {
        return (primeraNota + segundaNota + terceraNota) / 3;
    }

    static String estado(double nota) {
        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    static double necesitaEnSupletorio(double nota) {
        if (!estado(nota).equals("Supletorio")) {
            return -1;
        }

        return 28 - nota;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double primeraNota = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double segundaNota = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double terceraNota = scanner.nextDouble();

        double promedioFinal = promedio(
                primeraNota, segundaNota, terceraNota);

        System.out.printf("Promedio: %.2f - %s%n",
                promedioFinal, estado(promedioFinal));

        double supletorioMinimo =
                necesitaEnSupletorio(promedioFinal);

        if (supletorioMinimo != -1) {
            System.out.printf(
                    "Necesitas al menos %.2f en el supletorio.%n",
                    supletorioMinimo);
        }
    }
}
