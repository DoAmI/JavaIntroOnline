package Algorithmization.TasksMassiveOfMassive;
/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму*/
public class Task9 {
    public static void main(String[] args) {
        System.out.println(maxSumRow(9));
    }

    private static String maxSumRow(int n){
        /*переменные
        * maxSum = для хранения максимальной суммы в столбике
        * currentSum = для подсчета текущей суммы
        * rowId = для хранения индекса максимального столбика
        * */
        int maxSum = 0, currentSum, rowId = 0;
        int[][] a = new int[n][n];
        /*i - индекс столбика*/
        for (int i = 0; i < n; i++) {
            /*обнуление currentSum для каждого столбика*/
            currentSum = 0;
            /*j - индекс строки*/
            for (int j = 0; j < n; j++) {
                a[j][i] = i+j;
                /*сумма нарастает с каждым элементом*/
                currentSum+=a[j][i];
                System.out.println(a[j][i]);
            }
            System.out.println("текущая сумма "+i+" столбика = "+currentSum);
            /*если текущая сумма больше максимальной, присваиваем максимальной значение текущей. */
            if(currentSum>maxSum){
                maxSum = currentSum;
                rowId = i;
            }
            System.out.println();
        }
        /*вывод на экран*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        /*возврат строки*/
        return String.format("максимальная сумма составляет %d в столбике %d",maxSum,rowId);
    }
}
