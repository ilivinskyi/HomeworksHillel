import homeworkthree.Cat;
import homeworkthree.Dog;
import homeworkthree.Animal;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобік");
        Cat murzik = new Cat("Мурзик");

        bobik.run(150);
        murzik.run(100);

        bobik.swim(5);
        murzik.swim(1);

        System.out.println("Створено тварин: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котів: " + Cat.getCatCount());
    }
}