package Basics_of_software_code_development.Cycles;

import java.util.ArrayList;

public class Task8 {
    /*Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/
    public static void main(String[] args) {
        intersection(3215614,31651);
    }

    private static void intersection(int a, int b){
        /*список для всех цифр, входящих в состав первого и второго*/
        ArrayList<Character> intersectionList = new ArrayList();

        /*помещаем числа в строки. легче сравнивать*/
        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);

        /*перебор символов 1 строки*/
        for (int i = 0; i < stringA.length(); i++) {
            /*перебор символов 2 строки*/
            for (int j = 0; j < stringB.length(); j++) {
                /*если символ из первой строки равен символу второй строки и в списке пересечений его нет, то
                * добавить его в список
                * */
                if(stringA.charAt(i)==stringB.charAt(j) && !intersectionList.contains(stringA.charAt(i))){
                    intersectionList.add(stringA.charAt(i));
                }
            }
        }

        /*вывод списка на экран*/
        for (int i = 0; i < intersectionList.size(); i++) {
            System.out.print(intersectionList.get(i)+" ");
        }
    }
}
