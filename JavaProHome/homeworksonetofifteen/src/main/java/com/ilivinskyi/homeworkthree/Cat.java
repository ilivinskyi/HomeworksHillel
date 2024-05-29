package homeworkthree;

public class Cat extends Animal {

    static int catCount = 0;
    private final String name;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не може пробігти " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не вміє плавати");
    }
}
