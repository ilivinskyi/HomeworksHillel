package homeworkexceptions;

public class ArrayValueCalculator {

    public int doCalc(String[][] matrix) throws Exception {
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new ArraySizeException("Input array must be 4x4.");
        }

        var sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int value = Integer.parseInt(matrix[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(
                        "Invalid data at cell [" + i + "][" + j + "]: " + matrix[i][j]
                    );
                }
            }
        }
        return sum;
    }
}
