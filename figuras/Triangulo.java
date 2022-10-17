package figuras;

public class Triangulo extends Figura implements interfazBidimensional{
    private double base;
    private double altura;
    @Override
    public double getArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "La figura es un un triangulo y su área es " + getArea();
    }
}
