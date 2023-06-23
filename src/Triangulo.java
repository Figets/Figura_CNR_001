import java.util.List;

public abstract class Triangulo extends Figura{

    private List<Punto> puntos;

    public Triangulo(double x, double y, List<Punto> puntos) {
        if(puntos.size()!=3){
            throw new IllegalArgumentException("Escriba los puntos del Tiangulo");
        }
        this.puntos = puntos;
    }


    @Override
    public double calcularArea() {
        double lado1 = puntos.get(0).calcularDistancia(puntos.get(0));
        double lado2 = puntos.get(1).calcularDistancia(puntos.get(1));
        double lado3 = puntos.get(2).calcularDistancia(puntos.get(2));
        double semiperimetro = (lado1 + lado2 + lado3)/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro - lado1)*(semiperimetro- lado2)*(semiperimetro - lado3));
        return area;
    }
    @Override
    public double calcularPerimetro(){
        double lado1 = puntos.get(0).calcularDistancia(puntos.get(0));
        double lado2 = puntos.get(1).calcularDistancia(puntos.get(1));
        double lado3 = puntos.get(2).calcularDistancia(puntos.get(2));
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

}
