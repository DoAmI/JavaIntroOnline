package Algorithmization.OneDimensionArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {
        /*Дана последовательность целых чисел (a1,a2,..). Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,..an)*/
        int[] a = {110,51,6,5,9,3,4,3,1,6,12,61,65,361,45,0};

        /*новый список*/
        List<Integer> newList = new ArrayList<>();

        /*
        * Arrays - класс
        * stream() - метод для получения потоков элементов массива, переданного в качестве параметра
        * min - метод потока, позволяющий получить мниимальный объект из потока
        * getAsInt - преобразование из OptionalInt в int
        * */
        int min = Arrays.stream(a).min().getAsInt();

        for (int i = 0; i < a.length; i++) {
            /*добавить все элементы, не равные min, в список newList*/
            if(a[i]!=min){
                newList.add(a[i]);
                System.out.println(newList.get(i));
            }
        }
    }
}
