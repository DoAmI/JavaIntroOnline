package Basics_of_software_code_development.Cycles;

public class Task6 {
    /*Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера*/

    public static void printing(){
        for (char a = 'A'; a<='z'; a++) {
            /*приведение к int-у символа char-а выведет его ASCII код*/
            int ascii = a;
            /*статический метод toBinaryString класса Integer принимает число и возвращает его в двоичном виде*/
            System.out.println(a+" = "+ascii+" = "+Integer.toBinaryString(ascii));
        }
    }
}
