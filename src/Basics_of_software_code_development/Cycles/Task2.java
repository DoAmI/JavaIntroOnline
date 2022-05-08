package Basics_of_software_code_development.Cycles;

import java.util.Scanner;

public class Task2 {
    /*Вычислить значения функции на отрезке [а,b] c шагом h*/
    public static void main(String[] args) {
        /*ввод данных*/
        System.out.println("введите значение A");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("введите значение B");
        int b = scanner.nextInt();
        System.out.println("введите значение h");
        int h = scanner.nextInt();

        /*перебор значений из отрезка [a,b] с шагом h и вызовом метода calculate()*/
        for (int i = a; i < b; i+=h) {
            System.out.println("y при x "+i+" = "+calculate(i));
        }
    }

    public static int calculate(int h){
        /*если h<=2, возвращаем -h. в иных случаях возвращаем h*/
        if (h<=2)
            return h*-1;
        else
            return h;
    }
}
