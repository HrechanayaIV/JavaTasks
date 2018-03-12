package task0;
/*
Используя циклы и метод:
System.out.print("* "), System.out.print("  "),
System.out.print("\n")
(для перехода на новую строку).
Выведите на экран:
· прямоугольник
· прямоугольный треугольник
· равносторонний треугольник
· ромб
 */

public class Cycles {
    public static void main(String[] args) {
        // printRectangle(5, 3);
        //System.out.println();
        //printRightTriangle(7);
        //System.out.println();
        //printEquilateralTriangle1(5);
        System.out.println();
        printRhombus(7);
    }

    public static void printRectangle(int width, int length) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void printRightTriangle(int catheter) {

        for (int i = catheter; i > 0; i--) {
            for (int j = i - 1; j < catheter; j++) {

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void printEquilateralTriangle1(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = i; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void printRhombus(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = length - i - 1; k < length; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < length; i++) {
            for (int j = length - i - 1; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < length; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
