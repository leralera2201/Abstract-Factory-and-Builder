package builder;

public class Rectangle {

    private double a;
    private double b;

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public double getPerimeter() {
        return 2*(a+b);
    }


    public double getArea() {
        return a*b;
    }

    public static class Builder{
        private Rectangle rectangleToBuild;

        public Builder() {
            this.rectangleToBuild = new Rectangle();
        }

        public Builder setSimilarTo(Rectangle rectangle){
            this.rectangleToBuild.a = rectangle.a;
            this.rectangleToBuild.b = rectangle.b;
            return this;
        }

        public Builder setA(double a){
            rectangleToBuild.setA(a);
            return this;
        }

        public Builder setB(double b){
            rectangleToBuild.setB(b);
            return this;
        }


        public Rectangle build(){
            return rectangleToBuild;
        }








    }


}
