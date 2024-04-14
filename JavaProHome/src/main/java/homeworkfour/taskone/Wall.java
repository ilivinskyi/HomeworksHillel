package homeworkfour.taskone;

public class Wall extends Obstacle {

    public Wall(int height) {
        super(height);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(this.size);
    }

    @Override
    public String toString() {
        return "Стінка";
    }
}
