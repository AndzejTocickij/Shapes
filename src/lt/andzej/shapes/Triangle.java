package lt.andzej.shapes;

public class Triangle extends Rectangle  {
    double perimeter;
    double area;
    double sideA;
    double sideB;
    double base;
    double height;


    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double base){
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
    }

    public Triangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }



    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public double getArea(double base, double height) {
         this.area = area;
        return area = (this.height * this.base) / 2 ;
    }
    public double getPerimeter(double sideA, double base, double sideB) {
       this.perimeter= perimeter;
        return  perimeter = sideA + base +sideB;
    }

    @Override
    public String toString() {
        return " Triangle{" +
                "perimeter=" + getPerimeter(this.sideA, this.base,this.sideB)+
                " Area=" + getArea(this.base,this.height) +
                '}';
    }


}
