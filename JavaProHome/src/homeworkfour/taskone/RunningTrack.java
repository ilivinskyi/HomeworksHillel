package homeworkfour.taskone;

public class RunningTrack extends Obstacle {
    public RunningTrack(int length) {
        super(length);
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(this.size);
    }

    @Override
    public String toString() {
        return "Бігова доріжка";
    }
}
