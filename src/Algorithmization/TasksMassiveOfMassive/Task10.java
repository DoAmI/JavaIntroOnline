package Algorithmization.TasksMassiveOfMassive;

import java.util.ArrayList;

/*Найти положительные элементы главной диагонали квадратной матрицы*/
public class Task10 {
    /*возвращается ArrayList, т.к. заранее не известно, сколько положительных элементов будет в массиве*/
    private static ArrayList<Integer> diagon(int[][] n){
        /*result - список для хранения всех положительных чисел из диагонали*/
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            /*индексы элементов из главной диагонали равны. и если число положительно, добавляем в список*/
            if(n[i][i]>0)
                result.add(n[i][i]);
        }
        return result;
    }
}
