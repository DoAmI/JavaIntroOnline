package Basics_of_software_code_development.Vetvleniya;

import java.util.Scanner;

public class Task1 {
    /*даны 2 угла треугольника. Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным*/
    public static void main(String[] args) {
        System.out.println("введите углы через запятую");
        String s = new Scanner(System.in).nextLine();

        /*вычисляем сумму 2 углов треугольника. сумма всех 3 углов 180 градусов*/
        int sum2 = Integer.parseInt(s.substring(0, s.indexOf(","))) + Integer.parseInt(s.substring(s.indexOf(",")+1));

        /*если сумма 2 углов == 90, то по определению третий будет равен 90, т.е. прямоугольный*/
        if (sum2==90){
            System.out.println("треугольник существует и он прямоугольный");
        }
        /*если сумма углов < 180 градусов и != 90, то такой треугольник может существовать, но прямоугольным он не будет*/
        else if (sum2<180)
            System.out.print("треугольник существует, но он не прямоугольный");
        /*сумма углов > 180, т.е. это уже не треугольник*/
        else
            System.out.println("треугольника не существует");
    }
}
