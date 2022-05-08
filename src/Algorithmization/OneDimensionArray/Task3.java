package Algorithmization.OneDimensionArray;

import java.util.Random;

public class Task3 {
    /*Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных,
положительных и нулевых элементов*/
    public static void main(String[] args) {
        System.out.println(statisticCounter(10));
    }
    private static String statisticCounter(int n){
        /*создание нового массива размером n*/
        int[] a = new int[n];
        /*массив для хранения статистики по числам в массиве A*/
        int[] stat = {0,0,0};

        /*рандомайзер для заполнения массива данными*/
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
            /*если текущее число положительно, наращивается stat[0]. если отрицательное - stat[1]. в случае 0 - stat[2]*/
            if(a[i]>0)
                stat[0]++;
            else if (a[i]<0)
                stat[1]++;
            else
                stat[2]++;
        }
        return String.format("В массиве %d положительных, %d отрицательных и %d нулевых чисел",stat[0],stat[1],stat[2]);
    }
}
