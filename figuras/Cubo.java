package figuras;

public class Cubo extends Figura implements interfazTridimensional{
    double lado;

    @Override
    public double getVolumen() {
        return getArea()*lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }
    
    @Override
    public String toString() {
        return "La figura es un cubo, su área es " + getArea() + " y su volumen " + getVolumen();
    }
}
