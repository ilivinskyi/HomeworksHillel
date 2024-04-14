package homeworkthree;

public abstract class Animal {

    static int animalCount = 0;

    protected Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
