package homeworkthree;

public class Dog extends Animal {
    static int dogCount = 0;
    private final String name;

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не може пробігти " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплив " + distance + " м");
        } else {
            System.out.println(name + " не може пропливти " + distance + " м");
        }
    }
}