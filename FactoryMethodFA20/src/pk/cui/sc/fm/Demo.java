package pk.cui.sc.fm;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(createShape("circle"));
        shapes.add(createShape("square"));
        shapes.add(createShape("triangle"));

        for (Shape s : shapes) {
            s.draw();
        }
    }

    public static Shape createShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
