package Basics_of_software_code_development.Cycles;

import static java.lang.Math.*;
public class Task5 {
    public static void main(String[] args) {
        /*Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен
заданному е. Общий член ряда имеет вид An = 1/2^n+1/3^n */

        /*начальный ряд данных*/
        double[] stairs = new double[10];

        /*эталон для сравнения*/
        double e = 0.14;
        double sum = 0;
        for (int i = 0; i < stairs.length; i++) {
            stairs[i] = 1/pow(2,i) + 1/pow(3,i);
            /*если текущее значение больше или равно эталону, вывести на экран и добавить к сумме*/
            if (abs(stairs[i])>=e){
                System.out.println(stairs[i]+" при i = "+i);
                sum+=stairs[i];
            }

        }
        System.out.println(sum);
    }
}
