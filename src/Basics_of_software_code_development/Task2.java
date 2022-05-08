package Basics_of_software_code_development;

import java.util.Scanner;
import static java.lang.Math.*;

/*задача по квадратным уравнениям*/
public class Task2 {
    public static void main(String[] args) {
        /*ввод переменной. через scanner*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите переменную a");
        double a = scanner.nextDouble();

        /*по дальнейшему условию будет деление на 2a. если a == 0, то получится деление на 0*/

        if (a==0)
            throw new ArithmeticException("a не может быть равной 0");

        System.out.println("введите переменную b");
        double b = scanner.nextDouble();
        System.out.println("введите переменную c");
        double c = scanner.nextDouble();

        /*из под корня четной степени нельзя вытащить отрицательное число*/
        double root = pow(b,2)+4*a*c;
        if (root<0)
            throw new ArithmeticException("корень четной степени из отрицательного невозможен");

        /*вычисление x*/
        double x = (b+sqrt(root))/(2*a)-pow(a,3)*c+pow(b,-2);
    }
}
