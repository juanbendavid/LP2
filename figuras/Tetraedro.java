package figuras;

public class Tetraedro extends Figura implements interfazTridimensional{
    double lado;

    @Override
    public double getVolumen() {
        return Math.pow(lado, 3) * Math.sqrt(2)/12;
    }

    @Override
    public double getArea() {
        return  Math.pow(lado, 2) * Math.sqrt(3);
    }
    
    @Override
    public String toString() {
        return "La figura es una esfera, su área es " + getArea() + " y su volumen " + getVolumen();
    }
}
