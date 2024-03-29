package lt.andzej.shapes;

import java.util.ArrayList;

public abstract class Shape {

    private String color = "red";
    private boolean filled = false;




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " A Shape with {" +
                "color of ='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
