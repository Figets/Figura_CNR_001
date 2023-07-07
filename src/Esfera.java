public class Esfera extends Circulo {

    private double radio;

    public Esfera(Punto centro,double radio) {
        super(centro, radio);
    }

    @Override
    public double calcularArea() {
        double area = 4 * Math.PI * Math.pow(getRadio(), 2);
        return area;
    }

    public double calcularVolumen() {
        double volumen = (4 * Math.PI * Math.pow(getRadio(), 3)) / 3;
        return volumen;
    }




}
