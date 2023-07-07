public class Cubo extends Cuadrado{
    public Cubo(Punto punto1, Punto punto2) {
        super(punto1, punto2);
    }

    @Override
    public double calcularArea() {
        double lado = punto1.calcularDistancia(punto2);
        double area = 6 * Math.pow(lado, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double lado = punto1.calcularDistancia(punto2);
        double perimetro = 12 * lado;
        return perimetro;
    }

    public double calcularVolumen() {
        double lado = punto1.calcularDistancia(punto2);
        double volumen = Math.pow(lado, 3);
        return volumen;
    }


}
