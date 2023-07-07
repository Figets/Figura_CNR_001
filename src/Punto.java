public class Punto {
    protected double x;
    protected double y;
    protected  double z;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double calcularDistancia(Punto otroPunto){
        double distanciaX=this.x - otroPunto.x;
        double distanciaY=this.y - otroPunto.y;
        double distancia = Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
        return distancia;
    }

    
}
