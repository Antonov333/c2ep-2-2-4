import java.util.Arrays;

public class Matrix {
    int numberOfLines, numberOfRows;
    double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int numberOfLines, int numberOfRows) {
        this.numberOfLines = numberOfLines;
        this.numberOfRows = numberOfRows;
        this.matrix = new double[numberOfLines][numberOfRows];
    }

    public double getElement(int line, int row) {
        return matrix[line - 1][row - 1];
    }

    public void setElement(int line, int row, double value) {
        matrix[line - 1][row - 1] = value;
    }

    public void printMatrix() {
        System.out.println("Printing matrix of " + numberOfLines + " lines and " + numberOfRows + " rows");
        for (int i = 0; i <= numberOfLines - 1; i++) {
            for (int j = 0; j <= numberOfRows - 1; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void fill(double value) {
        for (int i = 0; i <= numberOfLines - 1; i++) {
            for (int j = 0; j <= numberOfRows - 1; j++) {
                matrix[i][j] = value;
            }
        }

    }

    public void multiplyByNumber(double value) {
        for (int i = 0; i <= numberOfLines - 1; i++) {
            for (int j = 0; j <= numberOfRows - 1; j++) {
                matrix[i][j] = matrix[i][j] * value;
            }
        }
    }

    public static Matrix sum(Matrix a, Matrix b) {
        int lines = a.numberOfLines,
                rows = a.numberOfRows;
        if (rows != b.numberOfRows || lines != b.numberOfLines) {
            System.out.println("different dimensions");
            return null;
        }

        Matrix result = new Matrix(lines, rows);
        for (int i = 1; i <= lines; i++) {


            for (int j = 1; j <= rows; j++) {
                result.setElement(i, j, a.getElement(i, j) + b.getElement(i, j));
            }
        }
        return result;
    }
}
