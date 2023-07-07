import java.util.List;

public class Piramide extends Triangulo {
    private double altura;

    public Piramide(List<Punto> puntos, double altura) {
        super(puntos);

        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        Punto Punto1 = puntos.get(0);
        Punto Punto2 = puntos.get(1);
        Punto Punto3 = puntos.get(2);

        double lado1 = Punto1.calcularDistancia(Punto2);
        double lado2 = Punto2.calcularDistancia(Punto3);
        double lado3 = Punto3.calcularDistancia(Punto1);
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double areaBase = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        double areaLateral = (lado1 + lado2 + lado3) * altura;
        double areaTotal = areaBase + areaLateral;
        return areaTotal;

    }

    @Override
    public double calcularPerimetro() {
        Punto punto1 = puntos.get(0);
        Punto punto2 = puntos.get(1);
        Punto punto3 = puntos.get(2);

        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);

        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    public double calcularVolumen() {
        double areaBase = super.calcularArea();
        double volumen = (areaBase * altura) / 3;
        return volumen;
    }

}
