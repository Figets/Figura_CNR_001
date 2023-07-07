public class Circulo extends Figura {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI*radio*radio;
        return area;
    }
    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI*radio;
        return perimetro;
    }



}
