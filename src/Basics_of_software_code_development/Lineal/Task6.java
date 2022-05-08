package Basics_of_software_code_development.Lineal;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите координаты x и y через запятую");
        /*помещаем строку с координатами в переменную*/
        String values = scanner.nextLine();
    }
    private static boolean calculate(String values){
        /*метод для вычисления*/
        /*минимальные и максимальные значения фигуры*/
        int min_x = -4,max_x = 4,min_y = -3,max_y = 4;

        /*парсинг строки на переменные x и y*/
        double x = Double.parseDouble(values.substring(0,values.indexOf(",")));
        double y = Double.parseDouble(values.substring(values.indexOf(",")+1));

        /*если x между max_x и min_x и y между max_y и min_y*/
        if (x>=min_x&&x<=max_x&&y>=min_y&&y<=max_y)
            return true;
        else
            return false;
    }
}
