package homeworktwo;

import homeworktwo.car.Car;
import homeworktwo.employee.Employee;
import homeworktwo.one.SameName;

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
        homeworktwo.two.SameName sameNameTwo = new homeworktwo.two.SameName();

        sameNameOne.print();
        sameNameTwo.print();

        Car car = new Car();
        car.start();
    }
}
