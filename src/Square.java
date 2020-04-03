public class Square implements IFigure{
    private double a;

    public double getA() {
        return a;
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    @Override
    public double getArea() {
        return a*a;
    }
}
