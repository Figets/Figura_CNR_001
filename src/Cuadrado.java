public class Cuadrado extends Figura {
    public Punto punto1;
    public Punto punto2;

    public Cuadrado(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    @Override
    public double calcularArea() {
        double lado = punto1.calcularDistancia(punto2);
        double area = lado * lado;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double lado = punto1.calcularDistancia(punto2);
        double perimetro = 4* lado ;
        return perimetro;
    }

}
