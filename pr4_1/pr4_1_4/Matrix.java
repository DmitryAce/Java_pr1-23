package pr4_1.pr4_1_4;

public class Matrix {
    private double[][] matrix; // ��������� ������ ������������ �����
    private int rows;           // ���������� �����
    private int columns;        // ���������� ��������

    // ����������� ��� �������� ������� � ��������� ���������
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    // ����� ��� �������� ���� ������
    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            throw new IllegalArgumentException("������� ������ ����� ���������� ������� ��� ��������");
        }

        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.matrix[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }

        return resultMatrix;
    }

    // ����� ��� ��������� ������� �� �����
    public Matrix multiply(double scalar) {
        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.matrix[i][j] = this.matrix[i][j] * scalar;
            }
        }

        return resultMatrix;
    }

    // ����� ��� ������ ������� �� ������
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

        // �������� ������� ������� (��� ����� ���� ������, �� ������ ��������� ������� �� ������ ������)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1.matrix[i][j] = i + j;
                matrix2.matrix[i][j] = i - j;
            }
        }

        // ������� ��� ������� �� ������
        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("Matrix 2:");
        matrix2.print();

        // ���������� �������� � ���������
        Matrix resultMatrix = matrix1.add(matrix2);
        System.out.println("��������� �������� ������:");
        resultMatrix.print();

        resultMatrix = matrix1.multiply(2.0);
        System.out.println("��������� ��������� ������� �� �����:");
        resultMatrix.print();
    }
}
