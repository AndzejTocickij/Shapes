package lt.andzej.shapes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestC {


    public static void main(String[] args) {
        ArrayList<Shape> objektai = new ArrayList<Shape>();
        objektai.add(new Circle(10) );
        objektai.add(new Rectangle(4, 8));
        objektai.add(new Square(2));
        objektai.add(new Triangle(2,2,3));

        for (Shape things : objektai) {
            System.out.println(things);
        }

    }
}