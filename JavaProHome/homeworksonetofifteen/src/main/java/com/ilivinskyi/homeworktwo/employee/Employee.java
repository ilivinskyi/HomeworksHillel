package homeworktwo.employee;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    // Конструктор
    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // Геттери
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    // Сеттери
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return (
            "Employee{" +
            "fullName='" +
            fullName +
            '\'' +
            ", position='" +
            position +
            '\'' +
            ", email='" +
            email +
            '\'' +
            ", phoneNumber='" +
            phoneNumber +
            '\'' +
            ", age=" +
            age +
            '}'
        );
    }
}
