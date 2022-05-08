package Basics_of_software_code_development.Cycles;

import java.util.Scanner;

public class Task7 {
    /*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры*/
    public static void main(String[] args) {
        /*ввод границ*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите m");
        int m = scanner.nextInt();
        System.out.println("введите n");
        int n = scanner.nextInt();

        /*переменная count для подсчета количества делителей для каждого числа*/
        int count;
        for (int i = m; i < n; i++) {
            /*перебор всех чисел*/
            count = 0;
            for (int j = 2; j < i-1; j++) {
                /*перебор чисел от 2 до самого числа-1, чтобы 1 и само число не попало*/
                if(i%j==0){
                    /*если остаток от деления числа на какое либо число от 2 до самого числа-1 == 0, инкрементировать count*/
                    count++;
                }
            }
            System.out.printf("для числа %d есть %d делителей\n",i,count);
        }
    }
}
