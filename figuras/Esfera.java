package figuras;

public class Esfera extends Figura implements interfazTridimensional{
    double radio;

    @Override
    public double getVolumen() {
        return 4/3*Math.PI * Math.pow(radio, 3);
    }

    @Override
    public double getArea() {
        return 4*Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public String toString() {
        return "La figura es una esfera, su área es " + getArea() + " y su volumen " + getVolumen();
    }
}
