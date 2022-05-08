package Basics_of_software_code_development.Lineal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    /*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа*/
    public static void main(String[] args) {
        double input = 666.555;
        double a = Math.floor(input);
        DecimalFormat format = new DecimalFormat("###.###");

        System.out.println(format.format(input%a*1000+a/1000));
    }
}
