public class Main {

    public static void main(String[] args) {

        IFigure rect = AbstractFactory.create(2,3,Figure.RECTANGLE);
        IFigure romb = AbstractFactory.create(3,4,Figure.ROMBUS);
        IFigure square = AbstractFactory.create(5);
        System.out.println(rect.toString());
        System.out.println(romb.toString());
        System.out.println(square.toString());

    }
}
