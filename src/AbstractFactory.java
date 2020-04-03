public class AbstractFactory {
    public static IFigure create(double a, double b, Figure figure){

        switch (figure) {
            case ROMBUS: return new Rombus(a, b);
            case RECTANGLE: return new Rectangle(a, b);
            default: return null;
        }
    }

    public static IFigure create(double a) {
        return new Square(a);
    }
}
