import java.util.Arrays;

public class Matrix {
    int numberOfLines, numberOfRows;
    double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int numberOfLines, int numberOfRows) {
        this.matrix = new double[numberOfLines][numberOfRows];
    }
}
