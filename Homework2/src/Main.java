import car.Car;
import employee.Employee;
import one.SameName;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "John Doe",
                "Support Engineer",
                "john.doe@mail.com",
                "+1234567890",
                32
        );
        System.out.println(employee);

        SameName sameNameOne = new SameName();
        two.SameName sameNameTwo = new two.SameName();

        sameNameOne.print();
        sameNameTwo.print();

        Car car = new Car();
        car.start();
    }
}