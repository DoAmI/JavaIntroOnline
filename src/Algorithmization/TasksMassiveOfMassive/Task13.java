package Algorithmization.TasksMassiveOfMassive;

import java.util.Random;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов*/
public class Task13 {
    public static void main(String[] args) {
        /*создание и заполнение массива случайными числами от 0 до 20*/
        Random r = new Random();
        int[][] a = new int[10][10];
        /*вывод на экран оригинального массива*/
        System.out.println("оригинальный массив");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        a = sortingIncr(a);
        /*вывод на экран*/
        System.out.println("сортированный массив. по возрастанию");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        a = sortingDescr(a);
        /*вывод на экран*/
        System.out.println("сортированный массив. по убыванию");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] sortingIncr(int[][] a){
        for (int i = 0; i < a[0].length; i++) {
            int temp;
            /*сортировка пузырьком*/
            for(int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i].length-1-j; k++) {
                    if(a[k][i]>a[k+1][i]){
                        temp = a[k+1][i];
                        a[k+1][i] = a[k][i];
                        a[k][i] = temp;
                    }
                }
            }
        }
        return a;
    }

    private static int[][] sortingDescr(int[][] a){
        for (int i = 0; i < a[0].length; i++) {
            int temp;
            for(int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i].length-1-j; k++) {
                    if(a[k][i]<a[k+1][i]){
                        temp = a[k][i];
                        a[k][i] = a[k+1][i];
                        a[k+1][i] = temp;
                    }
                }
            }
        }
        return a;
    }
}
