package Basics_of_software_code_development.Cycles;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    /*Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа*/
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое положительное число");
        int end = scanner.nextInt();

        /*если число меньше или равно 0, то выводится ошибка*/
        if (end<=0)
            throw new IOException("введено некорректное число");
        int iter = 1;
        int sum = 0;

        /*выполнять сложение к переменной sum значения iter до тех пор, пока верно условие iter<=end*/
        do{
            sum+=iter;
            iter++;
        }
        while (iter<=end);
        System.out.println(sum);
    }

}
