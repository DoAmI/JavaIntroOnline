package Basics_of_software_code_development;

import java.util.Scanner;
import static java.lang.Math.*;

/*задача 3*/
public class Task3 {
    public static void main(String[] args) {
        /*ввод значений*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите x");
        double x = scanner.nextDouble();
        System.out.println("введите y");
        double y = scanner.nextDouble();

        /*cos(x)-sin(y) используется также для проверки на исключения. лучше убрать в переменную*/
        double d = cos(x)-sin(y);

        /*проверка на деление на 0*/
        if (d==0)
            throw new ArithmeticException("Некорректные углы. В делителе получился 0");

        /*вычисление*/
        double xy = (sin(x)+cos(y))/(d)*tan(x*y);
    }
}
