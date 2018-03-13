package task0;

import java.util.Random;

/*
3. Дана квадратная матрица A порядка M (M — нечетное число). Начи-
ная с элемента A1,1 и перемещаясь по часовой стрелке, вывести все ее эле-
менты по спирали: первая строка, последний столбец, последняя строка в
обратном  порядке,  первый  столбец  в  обратном  порядке,  оставшиеся  эле-
менты второй строки и т. д.; последним выводится центральный элемент
матрицы
 */
public class MatrixTask3 {
    public static void main(String[] args) {
       int[][] m = generateMatrix(3);
        MatrixTask1.printMatrix(m);
        printBySpiral(m);
    }
    private static void printBySpiral(int[][] a){

            for (int i = 0; i <= a.length; i++) {
                for (int j = i; j < a.length-i ; j++) {
                    System.out.print(a[i][j]+ "; ");
                }
                for (int j = i+1; j < a.length - i; j++) {
                    System.out.print(a[j][a.length-i-1] + "; ");
                }
                for (int j = a.length-i-2 ; j >= i ; j--) {
                    System.out.print(a[a.length-i-1][j] + "; ");
                }
                for (int j = a.length-i-1; j > i ; j--) {
                    if(j-1!=i) {
                        System.out.print(a[j-1][i] + "; ");
                    }
                }
            }
    }
    private static int[][] generateMatrix(int m){

        int[][] matrix = new int[m][m];
        if(m%2!=1){
            System.out.println("the order of the matrix must be odd!");
        }else {
            Random random = new Random(m);
            for (int i = 0; i < m ; i++) {
                for (int j = 0; j < m ; j++) {
                    matrix[i][j] = random.nextInt(m);
                }
            }
            System.out.println();
        }
        return matrix;
    }
}
