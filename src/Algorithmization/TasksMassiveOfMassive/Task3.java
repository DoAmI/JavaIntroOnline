package Algorithmization.TasksMassiveOfMassive;
/* Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/
public class Task3 {
    private void printer(int[][] a, int k, int p){
        /*вывод строки*/
        for(int i = 0; i<a[0].length; i++)
            /*вывод строки k-1(т.к. нумерация с 0, 3 столбик будет иметь индекс 2)*/
            System.out.println(a[k-1][i]);
        /*вывод столбца*/
        for(int i = 0; i<a.length; i++)
            /*номер строки меняется, а номер столбца остается p-1*/
            System.out.println(a[i][p-1]);
    }
}
