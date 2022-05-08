package Basics_of_software_code_development.Vetvleniya;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task2 {
    /*Найти max{min(a, b), min(c, d)}*/
    public static void main(String[] args) {
        int a,b,c,d,result;
        /*ввод данных*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите A");
        a = scanner.nextInt();
        System.out.println("введите B");
        b = scanner.nextInt();
        System.out.println("введите C");
        c = scanner.nextInt();
        System.out.println("введите D");
        d = scanner.nextInt();

        /*вычисление результата. используются методы класса Math из пакета java.lang*/
        result = max(min(a,b),min(c,d));
    }
}
