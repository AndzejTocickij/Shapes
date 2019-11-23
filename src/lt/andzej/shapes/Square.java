package lt.andzej.shapes;

public class Square extends Rectangle {
    double side;

    public double getSide(double side) {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }



    // Default Square constructor
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return " Square is a sub-class of shape{" +
                " width="  +
                " Area of the square "+ getSide(this.side) * getSide(this.side)  +
                " Perimeter of the square "+ ( getSide(this.side) + getSide(this.side)  + getSide(this.side) + getSide(this.side)  ) +
                " Side of a square "+ getSide(this.side) +
                '}';
    }
}
