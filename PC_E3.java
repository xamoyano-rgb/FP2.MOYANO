
import java.util.Scanner;

public class PC_E3 {

    static double volumen(double lado) {
        return lado * lado * lado;
    }

    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    static void mostrarMenu() {
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.println("4. Salir");
        System.out.print("Opción: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Lado: ");
                    System.out.printf("Volumen: %.2f%n",
                            volumen(scanner.nextDouble()));
                    break;

                case 2:
                    System.out.print("Radio y altura: ");
                    double radio = scanner.nextDouble();
                    double altura = scanner.nextDouble();

                    System.out.printf("Volumen: %.2f%n",
                            volumen(radio, altura));
                    break;

                case 3:
                    System.out.print("Largo, ancho y alto: ");
                    double largo = scanner.nextDouble();
                    double ancho = scanner.nextDouble();
                    double alto = scanner.nextDouble();

                    System.out.printf("Volumen: %.2f%n",
                            volumen(largo, ancho, alto));
                    break;

                case 4:
                    System.out.println("Fin.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}
