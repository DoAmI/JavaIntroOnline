package Algorithmization.OneDimensionArray;

public class Task5 {
    /*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i*/
    public static void main(String[] args) {
        /*создание массива*/
        int[] a = {10,6,3,1,0};
        /*сравнение с индексом элемента в массиве*/
        for (int i = 0; i < a.length; i++) {
            if(a[i]>i)
                System.out.println(a[i]);
        }
    }
}
