package homeworkfour.taskone;

public abstract class Participant {

    protected Obstacle obstacle;

    protected final String name;
    protected final int maxRunDistance;
    protected final int maxJumpHeight;

    protected Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(overcomeSuccessMessage(distance));
            return true;
        } else {
            System.out.println(overcomeFailureMessage(distance, maxRunDistance));
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(overcomeSuccessMessage(height));
            return true;
        } else {
            System.out.println(overcomeFailureMessage(height, maxJumpHeight));
            return false;
        }
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    private String overcomeSuccessMessage(int distance) {
        return (
            "Учасник " +
            name +
            " пройшов перешкоду " +
            obstacle.toString().toLowerCase() +
            " на дистанції " +
            distance
        );
    }

    private String overcomeFailureMessage(int distance, int passedDistance) {
        return (
            "Учасник " +
            name +
            " не пройшов перешкоду " +
            obstacle.toString().toLowerCase() +
            " на дистанції " +
            distance +
            ". Пройдено " +
            passedDistance
        );
    }
}
