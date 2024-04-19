import homeworkexceptions.ArrayDataException;
import homeworkexceptions.ArraySizeException;
import homeworkexceptions.ArrayValueCalculator;

public class Main {

    static String[][] validTestArray = {
        { "1", "2", "3", "4" },
        { "5", "6", "7", "8" },
        { "9", "10", "11", "12" },
        { "13", "14", "15", "16" }
    };

    static String[][] invalidTestArray = {
        { "1", "2", "3", "4" },
        { "5", "6", "7", "8" },
        { "9", "10", "wow", "12" },
        { "13", "14", "15", "16" }
    };

    public static void main(String[] args) {
        var arrayCalc = new ArrayValueCalculator();
        try {
            System.out.println("Sum of elements: " + arrayCalc.doCalc(validTestArray));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Sum of elements: " + arrayCalc.doCalc(invalidTestArray));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
