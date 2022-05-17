package Algorithmization.TasksMassiveOfMassive;

import java.util.Random;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца*/
public class Task14 {
    /*инициация матрицы*/
    private static Random r = new Random();
    private static int m = r.nextInt(10)+1;
    private static int n = r.nextInt(10)+1;
    private static int[][] binaryArray = new int[m][n];

    public static void main(String[] args) {
        /*если столбцов больше, чем строк, то работаем только с квадратной матрицей m*m
        * столбики от m до n заполняем 1
        * */
        if(n>=m){
            for (int i = 0; i < m; i++) {
                for (int j = m; j < n; j++) {
                    binaryArray[i][j] = 1;
                }
            }
            /*метод setter принимает значение индекса колонки, до которой нужно обрабатывать массив*/
            setter(m);
        } else{
            setter(n);
        }

        /*вывод*/
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray[i].length; j++) {
                System.out.print(binaryArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void setter(int m){
        int counter = 0;
        int index;
        /*нулевой столбик не трогаем, т.к. если индекс равен 0, то в нем не будет единиц*/
        for (int i = 1; i < m; i++) {
            /*counter - для подсчета единиц в столбике. обнуляется каждый столбик
            * index - текущий рандомный индекс строки, в которую присвоим 1
            * */
            /*если количество 1 в столбике меньше индекса столбика*/
            counter = 0;
            while (counter<i){
                /*рандомный подбор индекса*/
                index = r.nextInt(m);
                /*если в текущей ячейке 0, присвоить ячейке значение 1 и увеличить counter
                * иначе следующая итерация
                * */
                if(binaryArray[index][i]==0){
                    binaryArray[index][i] = 1;
                    counter++;
                }
                else
                    continue;
            }
        }
    }
}
