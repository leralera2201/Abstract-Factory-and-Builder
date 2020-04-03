package builder;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2,3);
        Rectangle rect2 = new Rectangle.Builder()
                .setA(4)
                .setB(5)
                .build();
        System.out.println(rect);
        System.out.println(rect2);
        Rectangle rect3 = new Rectangle.Builder()
                .setSimilarTo(rect2)
                .setB(6)
                .build();
        System.out.println(rect3);

    }
}
