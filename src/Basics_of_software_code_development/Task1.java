package Basics_of_software_code_development;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите значение a");
        double a = scanner.nextDouble();
        System.out.println("введите значение b");
        double b = scanner.nextDouble();
        System.out.println("введите значение c");
        double c = scanner.nextDouble();
        double z = ((a-3)*b/2)+c;
    }
}
