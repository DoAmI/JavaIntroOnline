package Algorithmization.TasksMassiveOfMassive;

import java.util.Random;

/* Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/
public class Task12 {
    public static void main(String[] args) {
        /*создание и заполнение массива случайными числами от 0 до 20*/
        Random r = new Random();
        int[][] a = new int[10][10];
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
        for (int i = 0; i < a.length; i++) {
            int temp;
            /*сортировка пузырьком*/
            for(int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length-1-j; k++) {
                    if(a[i][k]>a[i][k+1]){
                        temp = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = temp;
                    }
                }
            }
        }
        return a;
    }

    private static int[][] sortingDescr(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int temp;
            for(int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length-1-j; k++) {
                    if(a[i][k]<a[i][k+1]){
                        temp = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = temp;
                    }
                }
            }
        }
        return a;
    }
}
