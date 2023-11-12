package pr4_1.pr4_1_4;

public class Matrix {
    private double[][] matrix; // Двумерный массив вещественных чисел
    private int rows;           // Количество строк
    private int columns;        // Количество столбцов

    // Конструктор для создания матрицы с заданными размерами
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    // Метод для сложения двух матриц
    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для сложения");
        }

        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.matrix[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }

        return resultMatrix;
    }

    // Метод для умножения матрицы на число
    public Matrix multiply(double scalar) {
        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.matrix[i][j] = this.matrix[i][j] * scalar;
            }
        }

        return resultMatrix;
    }

    // Метод для вывода матрицы на печать
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(2, 3);

        // Заполним матрицы данными (это всего лишь пример, вы можете заполнить данными по вашему выбору)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1.matrix[i][j] = i + j;
                matrix2.matrix[i][j] = i - j;
            }
        }

        // Выведем обе матрицы на печать
        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("Matrix 2:");
        matrix2.print();

        // Произведем операции с матрицами
        Matrix resultMatrix = matrix1.add(matrix2);
        System.out.println("Результат сложения матриц:");
        resultMatrix.print();

        resultMatrix = matrix1.multiply(2.0);
        System.out.println("Результат умножения матрицы на число:");
        resultMatrix.print();
    }
}
