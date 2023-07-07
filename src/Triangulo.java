import java.util.List;

public class Triangulo extends Figura{

    protected List<Punto> puntos;

    public Triangulo(List<Punto> puntos) {
        if(puntos.size()!=3){
            throw new IllegalArgumentException("Escriba los puntos del Tiangulo");
        }
        this.puntos = puntos;
    }


    @Override
    public double calcularArea() {

        Punto punto1 = puntos.get(0);
        Punto punto2 = puntos.get(1);
        Punto punto3 = puntos.get(2);

        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);

        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;
    }
    @Override
    public double calcularPerimetro(){
        Punto punto1 = puntos.get(0);
        Punto punto2 = puntos.get(1);
        Punto punto3 = puntos.get(2);

        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);

        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

}
