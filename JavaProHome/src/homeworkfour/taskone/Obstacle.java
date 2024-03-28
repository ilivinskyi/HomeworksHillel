package homeworkfour.taskone;

public abstract class Obstacle {
    protected final int size;

    protected Obstacle(int size) {
        this.size = size;
    }

    public abstract boolean overcome(Participant participant);
}
