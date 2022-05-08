package Algorithmization.TasksMassiveOfMassive;
/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали*/
public class Task2 {
    private void printer(int[][] a){
        /*если матрица квадратная, то диагональ будет лежать в местах, где индексы столбиков и строк равны (0,0),(1,1) и т.д.*/
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][i]);
        }
    }
}
