import calc.Calc;

public class Main {

    public static void main(String[] args) {
        var calculator = new Calc();
        try {
            System.out.println(calculator.calculate(args[0], args[1], args[2]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Please check number of input parameters. " + e.getLocalizedMessage()
            );
        }
    }
}
