package figuras;

public class Cuadrado extends Figura implements interfazBidimensional{
    private double lado;
    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "La figura es un un cuadrado y su área es " + getArea();
    }
}
