package Algorithmization.TasksMassiveOfMassive;

import java.util.Random;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
*/
public class Task11 {
    public static void main(String[] args) {
        printer();
    }
    private static void printer(){
        int[][] a = new int[10][20];
        /*рандомайзер*/
        Random r = new Random();
        /*переменная StringBuilder для того, чтобы туда записывать строки
        * в зависимости от рандомайзера, могли быть от 0 до 10 строк, подходящими по условию
        * и т.к. String immutable, лучше использовать StringBuilder, во избежание замусоривания
        * */
        StringBuilder sb = new StringBuilder("строки с 3 и более элементами, кратными 5: ");
        /*counter5 - для подсчета элементов, кратных 5 в одной строке
        * counterAllCols - для подсчета всех строк, в которых есть более 3 элементов
        * */
        int counter5, counterAllCols = 0;
        /*заполнение массива*/
        for (int i = 0; i < a.length; i++) {
            counter5 = 0;
            for (int j = 0; j < a[i].length; j++) {
                /*nextInt с параметром 15 означает рандомную цифру от 0 до 15*/
                a[i][j] = r.nextInt(15);
                /*вывод на экран*/
                System.out.print(a[i][j]+" ");
                /*если кратно 5, счетчик увеличивается*/
                if(a[i][j]%5==0)
                    counter5++;
            }
            /*для каждой строки вывожу количество элементов, кратных 5. необязательно*/
            System.out.print("в этой строке "+counter5+" элементов, кратных 5\n");
            /*если счетчик больше или равен 3, увеличиваем счетчик для строк counterAllCols
            * и добавляем к sb индекс строки с пробелом
            * */
            if(counter5>=3){
                counterAllCols++;
                sb.append(i).append(" ");
            }
            System.out.println();
        }

        /*финальная проверка*/
        if(counterAllCols>0)
            System.out.println(sb);
        else
            System.out.println("так уж вышло, что в данной матрице нет строк с 3 и более элементами, кратными 5");
    }
}
