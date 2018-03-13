package task0;

/*
Дана целочисленная прямоугольная матрица.
1. Упорядочить столбцы по убыванию среднего значения.
 */
public class MatrixTask1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -1, 10, 8},
                {2, -2, 20, 6},
                {3, -3, 30, 5},
                {4, -4, 40, 10}
        };
        printMatrix(matrix);
        System.out.println(columnsAVG(matrix, 0));
        System.out.println(columnsAVG(matrix, 1));
        System.out.println(columnsAVG(matrix, 2));
        System.out.println(columnsAVG(matrix, 3));
        printMatrix(sortAVG(matrix));

    }

    public static int[][] sortAVG(int[][] a) {
        int rows = a.length;
        int columns = a[0].length;
        for (int k = 0; k < columns - 1; k++) {
            for (int i = columns - 1; i > k; i--) {
                if (columnsAVG(a, i) > columnsAVG(a, i - 1)) {
                    for (int j = 0; j < rows; j++) {
                        int temp = a[j][i];
                        a[j][i] = a[j][i - 1];
                        a[j][i - 1] = temp;
                    }
                }
            }
        }
        return a;
    }

    private static double columnsAVG(int[][] a, int column) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += a[j][column];
        }
        return sum / a[0].length;
    }

    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "; ");

            }
            System.out.println();
        }
    }
}
