package Algorithmization.OneDimensionArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    /*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен*/

    public static void main(String[] args) {
        /*создание списка*/
        List a = new ArrayList();
        a.add(12);
        a.add(11);
        a.add(122);
        a.add(121);
        a.add(0);
        System.out.println("произведено замен "+changing(a,10));
    }
    private static int changing(List<Integer> a, int z){
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            /*если текущее значение a больше, чем z, присваиваем методом set значение z. и наращиваем count*/
            if(a.get(i)>z){
                count++;
                a.set(i,z);
            }
            System.out.println(a.get(i));
        }
        return count;
    }
}
