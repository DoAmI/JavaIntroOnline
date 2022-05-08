package Algorithmization.OneDimensionArray;

import java.util.*;
/*В массиве целых чисел с количеством элементов n  найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.*/
public class Task9 {
    public static void main(String[] args) {
        /*вводные данные*/
        int[] a = {0,1,1,5,1,5,0,1,5,1,0,0,0};

        /*переменные.
        * value = для хранения значения, которое встречается чаще всего
        * maxCounter = для хранения счетчика самого часто встречающегося индекса массива
        * */
        int value = a[0],maxCounter = 1;

        /*map для хранения пары ключ(цифра)-значение(частота появления)*/
        HashMap<Integer,Integer> map = new HashMap();

        for (int i = 0; i < a.length; i++) {
            /*если цифра уже есть в мапе*/
            if(map.containsKey(a[i])){
                /*добавить в map с тем же ключом, но инкрементированым значением*/
                map.put(a[i],map.get(a[i])+1);
                /*если после обновления value для данного ключа он станет больше maxCounter, то:
                * в maxCounter присвоить текущее значение
                * в value присвоить текущий ключ, т.е. цифру из массива
                * */
                if(map.get(a[i])>maxCounter){
                    maxCounter = map.get(a[i]);
                    value = a[i];
                }
                /*если текущее value равен maxCounter, но текущая цифра меньше, чем то, что было в переменной value, то
                * присваиваю переменной value текущую цифру. при этом значение maxCounter не трогаем
                * */
                else if(map.get(a[i])==maxCounter && value>a[i]){
                    value=a[i];
                }
            }
            /*если цифры нет в мапе, добавить ее с частотой 1*/
            else
                map.put(a[i],1);
        }
        /*вывод самого часто встречаемого числа(наименьшего в случае одинакового количества повторов)*/
        System.out.printf("цифра %d встречается %d раз\n",value,maxCounter);
    }
}
