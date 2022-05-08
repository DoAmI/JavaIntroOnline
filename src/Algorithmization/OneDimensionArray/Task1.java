package Algorithmization.OneDimensionArray;

import java.util.Random;

public class Task1 {
    /*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К*/
    public static void main(String[] args) {
        calculate(10,2);
    }
    private static int calculate(int n, int k){
        int sum = 0;
        /*создание массива размером n*/
        int[] arr = new int[n];
        /*рандомайзер для заполнения массива*/
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            /*поместить в массив с индеком i случайное число от 0 до 9*/
            arr[i] = r.nextInt(10);
            if(arr[i]%k==0){
                /*если arr[i] при делении на k не дает остатка, то добавляем к сумме и выводим на экран*/
                sum+=arr[i];
                System.out.printf("%d кратен %d\n",arr[i],k);
            }
        }
        return sum;
    }
}
