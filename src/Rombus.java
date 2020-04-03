public class Rombus implements IFigure{

    private double a;
    private double h;

    @Override
    public String toString() {
        return "Rombus{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }

    public Rombus(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    @Override
    public double getArea() {
        return a*h;
    }
}
