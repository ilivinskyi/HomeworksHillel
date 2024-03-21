package homework2;

import homework2.car.Car;
import homework2.employee.Employee;
import homework2.one.SameName;

public class HomeWorkTwo {
    public void runHomeWork() {
        Employee employee = new Employee(
                "John Doe",
                "Support Engineer",
                "john.doe@mail.com",
                "+1234567890",
                32
        );
        System.out.println(employee);

        SameName sameNameOne = new SameName();
        homework2.two.SameName sameNameTwo = new homework2.two.SameName();

        sameNameOne.print();
        sameNameTwo.print();

        Car car = new Car();
        car.start();
    }
}
