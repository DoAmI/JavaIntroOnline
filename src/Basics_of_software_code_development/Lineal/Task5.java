package Basics_of_software_code_development.Lineal;

import java.util.Scanner;
/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc*/
public class Task5 {
    public static void main(String[] args) {
        /*ввод количества секунд*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число секунд");
        int seconds = scanner.nextInt();
        int minute = 0;
        int hours = 0;

        /*количество минут = целое от деления секунд на 60*/
        minute=seconds/60;

        /*после подсчета минут можно выправить остаток секунд*/
        seconds = seconds%60;

        /*количество часов = целое от деления минут на 60*/
        hours=minute/60;

        /*после подсчета часов можно выправить остаток минут*/
        minute=minute%60;

        /*print*/
        System.out.printf("%dч %dмин %dс",hours, minute,seconds);
    }
}
