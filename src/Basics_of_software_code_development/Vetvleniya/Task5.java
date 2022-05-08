package Basics_of_software_code_development.Vetvleniya;

import java.util.Scanner;

public class Task5 {
    /*Вычислить значение функции*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести X");
        int x = scanner.nextInt();
        double f;

        /*по условию, если x<=3, то решается по 1 уравнению. если x>3, то по второму*/
        if (x<=3){
            f = x*x-3*x+9;
        } else {
            f = 1/(Math.pow(x,3)+6);
        }
        System.out.println(f);
    }
}
