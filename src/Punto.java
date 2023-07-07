public class Punto {
    protected double x;
    protected double y;
    protected  double z;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calcularDistancia(Punto otroPunto){
        double distanciaX=this.x - otroPunto.x;
        double distanciaY=this.y - otroPunto.y;
        double distanciaZ=this.z - otroPunto.z;
        double distancia = Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY + distanciaZ * distanciaZ);
        return distancia;
    }

    public double getZ() {
        return z;
    }
}
