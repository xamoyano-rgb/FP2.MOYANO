
import java.util.Scanner;

public class PC_E1 {

    static double leerConsumo(Scanner scanner) {
        double consumoMetrosCubicos;

        do {
            System.out.print("Consumo (m3): ");
            consumoMetrosCubicos = scanner.nextDouble();

            if (consumoMetrosCubicos < 0) {
                System.out.println("Error: el consumo no puede ser negativo.");
            }

        } while (consumoMetrosCubicos < 0);

        return consumoMetrosCubicos;
    }

    static double calcularValor(double consumoMetrosCubicos) {
        final double cargoFijo = 2.50;
        final double limiteTramo = 15;
        final double tarifaBase = 0.40;
        final double tarifaExceso = 0.75;

        double valorConsumo;

        if (consumoMetrosCubicos <= limiteTramo) {
            valorConsumo = consumoMetrosCubicos * tarifaBase;
        } else {
            valorConsumo = limiteTramo * tarifaBase
                    + (consumoMetrosCubicos - limiteTramo) * tarifaExceso;
        }

        return cargoFijo + valorConsumo;
    }

    static void mostrarPlanilla(double consumoMetrosCubicos,
                                double valorTotal) {
        System.out.println("----- planilla de agua -----");
        System.out.printf("consumo: %.2f m3%n", consumoMetrosCubicos);
        System.out.printf("total a pagar: $%.2f%n", valorTotal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumoMetrosCubicos = leerConsumo(scanner);
        double valorTotal = calcularValor(consumoMetrosCubicos);

        mostrarPlanilla(consumoMetrosCubicos, valorTotal);
    }
}
