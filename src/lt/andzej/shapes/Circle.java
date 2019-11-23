package lt.andzej.shapes;

public class Circle extends Shape {
    private double radius = 1.0;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea (double radius) {
        this.radius = radius;
        return Math.PI * (radius * radius);
    }
    public double getPerimeter(double radius){
        this.radius = radius;
        return 2 * Math.PI * radius;
    }


    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }


    @Override
    public String toString() {
        return " A Circle with radius{" +
                " radius=" + radius +
                " Which is a sub-class of Shape" +
                " Area is " + getArea(radius) +
                " Perimeter is " + getPerimeter(radius) +
                '}';
    }



    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
}








