package calc;

public class Calc {

    public int calculate(String firstNumber, String secondNumber, String operation)
        throws NumberFormatException {
        int numberOne;
        int numberTwo;

        numberOne = Integer.parseInt(firstNumber);
        numberTwo = Integer.parseInt(secondNumber);

        return switch (operation) {
            case "-" -> numberOne - numberTwo;
            case "+" -> numberOne + numberTwo;
            case "*" -> numberOne * numberTwo;
            case "/" -> numberOne / numberTwo;
            default -> throw new IllegalArgumentException("Math operation not recognized.");
        };
    }
}
