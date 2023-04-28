import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n\nCourse2\n" +
                "topic: OOP\nExtra problem 2-2-4 \"Matrix\"");

        int lines = 3, rows = 4;

        Matrix a = new Matrix(lines, rows);
        Matrix b = new Matrix(lines, rows);
        Matrix c = new Matrix(lines, rows);
        a.fill(1);
        b.fill(1);
        b.multiplyByNumber(2);
        a.printMatrix();
        b.printMatrix();

        c = Matrix.sum(a, b);

        c.printMatrix();

    }
}