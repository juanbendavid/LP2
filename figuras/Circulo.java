package figuras;

public class Circulo extends Figura implements interfazBidimensional {
    private double radio;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "La figura es un un circulo y su área es " + getArea();
    }

}
