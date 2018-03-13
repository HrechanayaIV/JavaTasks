package task0;
/*
Дана целочисленная прямоугольная матрица.
2. Упорядочить строки,по возрастанию по
самой длинной серии одинаковых элементов.
 */

import java.util.ArrayList;

public class MatrixTask2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 10, 1},
                {2, -2, 20, 6},
                {3, 3, 3, 3},
                {4, 40, 41, 4}
        };
        MatrixTask1.printMatrix(matrix);
        System.out.println(maxCountOfIdenticalElement(matrix,0));
        System.out.println(maxCountOfIdenticalElement(matrix,1));
        System.out.println(maxCountOfIdenticalElement(matrix,2));
        System.out.println(maxCountOfIdenticalElement(matrix,3));
        MatrixTask1.printMatrix(sortBySeriesOfIdenticalElements(matrix));
    }
    private static int[][] sortBySeriesOfIdenticalElements(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j <a.length-1 ; j++) {
                if(maxCountOfIdenticalElement(a,j)>maxCountOfIdenticalElement(a,j+1)){
                    for (int k = 0; k < a[0].length; k++) {
                        int temp = a[j][k];
                        a[j][k] = a[j+1][k];
                        a[j+1][k] = temp;
                    }
                }
            }
        }
        return a;
    }
    private static int maxCountOfIdenticalElement(int[][] a, int row){
        int maxCount = 0;
        for (int i = 0; i < a[row].length;i++) {
            int temp = 0;
            for (int j = i; j <a[row].length ;j++ ) {
                if(a[row][j]==a[row][i]){
                    temp++;
                }
            }

            if(temp> maxCount) {
                maxCount = temp;
            }
        }
        return maxCount;
    }

}
