package homeworkfour.taskzero;

public class Square implements GeometricFigure {
    private final double sideLengths;

    public Square(double side) {
        this.sideLengths = side;
    }

    @Override
    public double getArea() {
        return sideLengths * sideLengths;
    }
}
