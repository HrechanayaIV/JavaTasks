package task0;

/*Сортировка последовательности
1. Упорядочить одномерный масиве вначале отрицательные повозрастанию
   затем положительные по убыванию.
2. В одномерном массиве сначала положительные потом отрицательные за О(n)
*/
public class SequenceSorting {
    public static void main(String[] args) {
        int[] a = {-1, 8, 5, 12, 0, 9, -8, 10, -7, -6, -10, -3};
        printArray(a);
        //printArray(sortAscending(a));
        //printArray(firstSort(a));
        printArray(secondSort(a));
    }

    //по возрастанию
    public static int[] sortAscending(int a[]) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] firstSort(int[] a) {
        sortAscending(a);
        int firstPositiveNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                firstPositiveNumber = i;
                break;
            }
        }
        for (int i = firstPositiveNumber; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] > a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] secondSort(int[] a) {
        int negativeNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negativeNumber++;
            } else {
                int temp = a[i];
                a[i - negativeNumber] = a[i];
                a[i] = a[i - negativeNumber];
                a[i - negativeNumber] = temp;
            }
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "; ");
        }
        System.out.println();
    }

}
