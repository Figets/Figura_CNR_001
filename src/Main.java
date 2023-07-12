
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void Entrada() {
        System.out.println("Figuras Geometricas:");
        System.out.println("1.- Triangulo");
        System.out.println("2.- Cuadrado");
        System.out.println("3.- Circulo");
        System.out.println("4.- Piramide");
        System.out.println("5.- Cubo");
        System.out.println("6.- Esfera");

        System.out.println("7.- Salir");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcion;
        do {
            Entrada();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    List<Punto> puntosTriangulo = new ArrayList<>();
                    for (int i = 0; i < 3; i++) {
                        System.out.print("El Punto " + (i + 1) + " del Triangulo (x , y): ");
                        double x = scanner.nextDouble();
                        double y = scanner.nextDouble();

                        scanner.nextLine();
                        Punto punto = new Punto(x, y);
                        puntosTriangulo.add(punto);
                    }
                    Triangulo triangulo = new Triangulo(puntosTriangulo);

                    System.out.println("Area del Triangulo: " + triangulo.calcularArea());
                    System.out.println("Perimetro del Triangulo: " + triangulo.calcularPerimetro());
                    System.out.println();
                    break;
                case "2":
                    System.out.print("El Punto 1 del Cuadrado (x , y): ");
                    double x1 = scanner.nextDouble();
                    double y1 = scanner.nextDouble();

                    scanner.nextLine();
                    System.out.print("El Punto 2 del Cuadrado (x , y): ");
                    double x2 = scanner.nextDouble();
                    double y2 = scanner.nextDouble();

                    scanner.nextLine();
                    Punto punto1 = new Punto(x1, y1);
                    Punto punto2 = new Punto(x2, y2);
                    Cuadrado cuadrado = new Cuadrado(punto1, punto2);


                    System.out.println("Area del Cuadrado: " + cuadrado.calcularArea());
                    System.out.println("Perimetro del Cuadrado: " + cuadrado.calcularPerimetro());
                    System.out.println();
                    break;
                case "3":
                    System.out.print("El Centro del Círculo (x , y): ");
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();

                    scanner.nextLine();
                    System.out.print("El radio del Círculo: ");
                    double radio = scanner.nextDouble();
                    scanner.nextLine();
                    Punto centro = new Punto(x, y);
                    Circulo circulo = new Circulo(centro, radio);


                    System.out.println("Area del Circulo: " + circulo.calcularArea());
                    System.out.println("Perimetro del Circulo: " + circulo.calcularPerimetro());
                    System.out.println();
                    break;
                case "4":

                    List<Punto> puntosPerimetro = new ArrayList<>();

                    for (int i = 1; i <= 3; i++) {
                        System.out.print("El Punto " + i + " de la Piramide (x , y , z): ");
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        double z = scanner.nextDouble();
                        scanner.nextLine();

                        Punto punto = new Punto(a, b, z);
                        puntosPerimetro.add(punto);
                    }

                    System.out.print("Altura de la Piramide: ");
                    double alturaPiramide = scanner.nextDouble();
                    scanner.nextLine();

                    Piramide piramide = new Piramide(puntosPerimetro, alturaPiramide);


                    System.out.println("Area de la Piramide: " + piramide.calcularArea());
                    System.out.println("Perimetro de la Piramide: " + piramide.calcularPerimetro());
                    System.out.println("Volumen de la Piramide: " + piramide.calcularVolumen());
                    System.out.println();
                    break;
                case "5":
                    System.out.print("Punto 1 del Cubo (x , y , z): ");
                    double c = scanner.nextDouble();
                    double d = scanner.nextDouble();
                    double c1 = scanner.nextDouble();
                    scanner.nextLine();
                    Punto punto01 = new Punto(c, d, c1);
                    System.out.print("Punto 2 del Cubo (x , y , z): ");
                    double e = scanner.nextDouble();
                    double f = scanner.nextDouble();
                    double e1 = scanner.nextDouble();
                    scanner.nextLine();
                    Punto punto02 = new Punto(e, f, e1);
                    Cubo cubo = new Cubo(punto01, punto02);

                    System.out.println("Area del Cubo: " + cubo.calcularArea());
                    System.out.println("Perimetro del Cubo: " + cubo.calcularPerimetro());
                    System.out.println("Volumen del Cubo: " + cubo.calcularVolumen());
                    System.out.println();
                    break;
                case "6":
                    System.out.print("Centro de la Esfera (x , y, z): ");
                    double g = scanner.nextDouble();
                    double h = scanner.nextDouble();
                    double g1 = scanner.nextDouble();
                    scanner.nextLine();
                    Punto centro01 = new Punto(g, h, g1);

                    System.out.print("El valor del radio de la Esfera: ");
                    double radio01 = scanner.nextDouble();
                    scanner.nextLine();

                    Esfera esfera = new Esfera(centro01,radio01);


                    System.out.println("Area de la Esfera: " + esfera.calcularArea());
                    System.out.println("Perimetro de la Esfera: " + esfera.calcularPerimetro());
                    System.out.println("Volumen de la Esfera: " + esfera.calcularVolumen());
                    System.out.println();

                    break;

                case "7":
                    System.out.println("Fin del codigo");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    System.out.println();
                    break;
            }
        } while (!opcion.equals("7"));

        scanner.close();
    }
}


