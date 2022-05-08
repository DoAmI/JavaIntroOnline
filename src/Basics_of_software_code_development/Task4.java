package Basics_of_software_code_development;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double input = 666.555;
        double a = Math.floor(input);
        DecimalFormat format = new DecimalFormat("###.###");

        System.out.println(format.format(input%a*1000+a/1000));
    }
}
