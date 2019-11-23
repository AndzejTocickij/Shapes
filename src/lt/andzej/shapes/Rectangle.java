package lt.andzej.shapes;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String toString() {
        return " Rectangle is a sub-class of shape{" +
                " width=" + width +
                " , length=" + length +
                " Area of the rectangle "+ getArea(this.width, this.length) +
                " Perimeter of the rectangle "+ getPerimeter(this.width, this.length) +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(double width, double length) {
        this.width = width;
        this.length = length;
        return width * length;
    }

   public double getPerimeter(double width, double length) {
       this.width = width;
       this.length = length;
       return (width * 2) + (length * 2 );
   }

}
