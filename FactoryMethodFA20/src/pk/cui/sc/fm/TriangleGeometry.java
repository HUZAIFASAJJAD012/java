package pk.cui.sc.fm;

public class TriangleGeometry extends Geometery {

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}