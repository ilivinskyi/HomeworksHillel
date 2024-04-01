import homeworkfour.taskone.*;
import homeworkfour.taskzero.Circle;
import homeworkfour.taskzero.GeometricFigure;
import homeworkfour.taskzero.Square;
import homeworkfour.taskzero.Triangle;


public class Main {
    // Загальна площа фігур
    public static void main(String[] args) {
        /// Total square of geometric figures
        GeometricFigure[] figures = new GeometricFigure[] {
                new Circle(10),
                new Triangle(6, 8),
                new Square(5)
        };
        System.out.println("Total area: " + calculateTotalArea(figures));

        /// Sport competition
        Participant[] participants = {
                new Human("Євген", 150, 2),
                new Cat("Пушок", 110, 1),
                new Robot("R2D2", 50, 4)
        };

        Obstacle[] obstacles = {
                new RunningTrack(100),
                new Wall(2)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                participant.setObstacle(obstacle);
                if (!obstacle.overcome(participant)) {
                    break;
                }
            }
        }
    }

    public static double calculateTotalArea(GeometricFigure[] figures) {
        double totalArea = 0;
        for (GeometricFigure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }
}